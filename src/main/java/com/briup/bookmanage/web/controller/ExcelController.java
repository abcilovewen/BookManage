package com.briup.bookmanage.web.controller;

import com.briup.bookmanage.bean.ex.BorrowEX;
import com.briup.bookmanage.service.IBorrowService;
import io.swagger.annotations.Api;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.net.URLEncoder;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@Api(description = "下载管理")
public class ExcelController {
    @Autowired
    private IBorrowService borrowService;

    @GetMapping("/downloadBorrow")
    public void downloadBorrow(HttpServletResponse response) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        XSSFRow row =sheet.createRow(0);

        XSSFCellStyle style = workbook.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);// 水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);// 垂直居中

        XSSFCell cell = row.createCell(0);

        cell.setCellType(CellType.STRING);
        cell.setCellValue("借阅信息表");
        cell.setCellStyle(style);
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,5));

        //第二行
        XSSFRow row2 =sheet.createRow(1);

        XSSFCell cell1 = row2.createCell(0);
        cell1.setCellType(CellType.STRING);
        cell1.setCellValue("借阅id");
        cell1.setCellStyle(style);

        XSSFCell cell2 = row2.createCell(1);
        cell2.setCellType(CellType.STRING);
        cell2.setCellValue("读者姓名");
        cell2.setCellStyle(style);

        XSSFCell cell3 = row2.createCell(2);
        cell3.setCellType(CellType.STRING);
        cell3.setCellValue("图书名称");
        cell3.setCellStyle(style);

        XSSFCell cell4 = row2.createCell(3);
        cell4.setCellType(CellType.STRING);
        cell4.setCellValue("借阅日期");
        cell4.setCellStyle(style);

        XSSFCell cell5 = row2.createCell(4);
        cell5.setCellType(CellType.STRING);
        cell5.setCellValue("归还日期");
        cell5.setCellStyle(style);

        XSSFCell cell6 = row2.createCell(5);
        cell6.setCellType(CellType.STRING);
        cell6.setCellValue("罚金");
        cell6.setCellStyle(style);

        List lists = borrowService.findAll();
        for (int i = 0; i < lists.size(); i++)          {
            row = sheet.createRow((int) i + 2);
            BorrowEX list = (BorrowEX) lists.get(i);
            // 第四步，创建单元格，并设置值
            row.createCell((short) 0).setCellValue(list.getId());
            row.createCell((short) 1).setCellValue(list.getrName());
            row.createCell((short) 2).setCellValue(list.getbName());
            row.createCell((short) 3).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(list.getbDate()));
            row.createCell((short) 4).setCellValue(new SimpleDateFormat("yyyy-MM-dd").format(list.getrDate()));
            row.createCell((short) 5).setCellValue(list.getFine());

        }
        response.setHeader("content-Type", "application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode("borrow.xlsx", "utf-8"));
        workbook.write(response.getOutputStream());

    }
}
