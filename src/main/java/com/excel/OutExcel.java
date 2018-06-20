package com.excel;

import com.gexin.fastjson.JSON;
import com.gexin.fastjson.JSONObject;
import com.sun.media.sound.InvalidFormatException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class OutExcel {
//
//    /**
//     * 读取EXCLE 示例  兼容全部
//     * 2015年11月23日13:55:06
//     *
//     * @throws IOException
//     * @throws InvalidFormatException
//     * @author gss
//     */
//    @SuppressWarnings("null")
//    public static void inExcle() {
//        try {
//            File file = new File("D:\\a.xls");
//            FileInputStream fileInputStream = new FileInputStream(file);
//
//            Workbook workbook = (Workbook) WorkbookFactory.create(fileInputStream);
//
//            org.apache.poi.ss.usermodel.Sheet sheet1 = workbook.getSheetAt(0); //第一个 sheet
//
//            int rowNum = sheet1.getLastRowNum();  //获取总行数
//            int coloumNum = sheet1.getRow(0).getPhysicalNumberOfCells();
//
//
//
//            int id=0001;
//
//            for (int i = 0; i < rowNum; i++) {
//
//                Row row = sheet1.getRow(i); //   第 0，1，2，3，4.。。。N 行数据
//                QyhUser user = new QyhUser();
//                user.setName(row.getCell(1) == null ? "" : row.getCell(1).toString());
//                user.setMobile(row.getCell(6) == null ? "" : row.getCell(6).toString()); //市
//                System.out.println(row.getCell(1) + "|" + row.getCell(6));
//                /**
//                 * 添加一个部门添加一个人
//                 */
//                String token = "";
//                // System.out.println("qyhtoken--"+token);
//                String parentid = "0000584";
//                QyhDepartment qyhdep = new QyhDepartment();
//                qyhdep.setId(id+"dzb");
//                qyhdep.setName(row.getCell(1) == null ? "" : row.getCell(1).toString());
//                qyhdep.setParentid(parentid);
//
//                String qyh_dep_create_url="https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token=ACCESS_TOKEN";
//                String url = qyh_dep_create_url.replace("ACCESS_TOKEN", token);
//                String jsonDep = JSONObject.fromObject(dep).toString();
////System.out.println("创建部门json=="+jsonDep);
//                JSONObject jsonObject = httpRequest(url, "POST", jsonDep);
//
//                String msg = jsonObject.toString();
//                Map resultJson = (Map) JSON.parse(msg);
//                if (!"0".equals(resultJson.get("errcode").toString())) {
//                    processResultService.processResult(request,
//                            new ExcuteResult(-1, "", "部门创建失败，平台返回代码" + resultJson.get("errcode").toString()),
//                            "企业号返回代码" + resultJson.get("errcode").toString(), out);
//                } else {
//                    yd.setSjbm(tglbm);
//                    yd.setLrr(user.getXm());
//                    yd.setId(qyhdep.getId());
//                    result = qyhDepService.insertQyhObj(yd);
//
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//            inExcle();
//        }
}

