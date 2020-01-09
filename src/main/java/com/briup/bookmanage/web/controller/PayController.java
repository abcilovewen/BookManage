package com.briup.bookmanage.web.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.briup.bookmanage.service.PayService;
import com.briup.bookmanage.util.AlipayConfig;
import com.briup.bookmanage.util.Message;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/estore")
@Api(description = "支付功能")
public class PayController {
    @GetMapping("/pay")
    public void pay(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            AlipayClient alipayClient =
                    AlipayConfig.getAlipayClient();
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest =
                    new AlipayTradePagePayRequest();

            AlipayTradePayModel model =
                    new AlipayTradePayModel();

            // 设定订单号 必须要写,且订单号不能重复，目前已经只是做测试，已经写死
            model.setOutTradeNo("4415");

            // 设置订单金额
            model.setTotalAmount("100.00");
            // 订单名字
            model.setSubject("书籍订单");
            // 订单描述
            model.setBody(System.currentTimeMillis() + "");

            // 产品码
            model.setProductCode("FAST_INSTANT_TRADE_PAY");

            // 设置参数
            alipayRequest.setBizModel(model);

            // 设置回调地址
            alipayRequest.setReturnUrl(AlipayConfig.return_url);

            String result = alipayClient.pageExecute(alipayRequest).getBody();

            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}