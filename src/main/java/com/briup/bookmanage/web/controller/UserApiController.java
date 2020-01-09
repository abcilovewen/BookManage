package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.annotation.UserLoginToken;
import com.briup.bookmanage.bean.User;
import com.briup.bookmanage.service.UserService;
import com.alibaba.fastjson.JSONObject;
import com.briup.bookmanage.util.JwtUtil;
import com.briup.bookmanage.util.Message;
import com.briup.bookmanage.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Api(description = "登录")
public class UserApiController {
    @Autowired
    UserService userService;
//    @Autowired
//    TokenService tokenService;
    //登录
    @PostMapping("/login")
    public Object login(@RequestBody User user){
        JSONObject jsonObject = new JSONObject();
        User userForBase = userService.findByUsername(user);
        if (userForBase == null){
            jsonObject.put("message","登录失败，用户不存在");
            return jsonObject;
        } else {
            if (!userForBase.getPassword().equals(user.getPassword())){
                jsonObject.put("message","登陆失败，密码错误");
                return jsonObject;
            } else {
//                String token = tokenService.getToken(userForBase);
                String token = JwtUtil.sign(user.getId());
                jsonObject.put("token",token);
                jsonObject.put("user",userForBase);
                return jsonObject;
            }
        }
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    public Message getMessage(String token){
        String verify = JwtUtil.verify(token);
        User checker = userService.Checker(verify);
        return MessageUtil.success(checker);
    }
}
