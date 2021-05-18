package org.example.vhr;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;

public class ExcalTest {
    public static void main(String[] args) {
        Sheet sheet;
        Workbook book;
        Cell cell1, cell2, cell3, cell4, cell5;
        JSONArray array = new JSONArray();
        try {
            //为要读取的excel文件名
            book = Workbook.getWorkbook(new File("/Users/zyy/Downloads/2021_5_10_order.csv"));

            //获得第一个工作表对象(ecxel中sheet的编号从0开始,0,1,2,3,....)
            sheet = book.getSheet(0);

            for (int i = 1; i < sheet.getRows(); i++) {
                //获取每一行的单元格
                cell1 = sheet.getCell(i-1, i);//（列，行）
//                cell2 = sheet.getCell(1, i);
//                cell3 = sheet.getCell(2, i);
//                cell4 = sheet.getCell(3, i);
//                cell5 = sheet.getCell(4, i);
                if ("".equals(cell1.getContents())) {//如果读取的数据为空
                    break;
                }
                JSONObject object = new JSONObject();
//                object.put("ID",cell1.getContents());
//                object.put("编号",cell2.getContents());
//                object.put("姓名",cell3.getContents());
//                object.put("数量",cell4.getContents());
//                object.put("住址",cell5.getContents());
                array.add(object);
            }
            System.out.println(array.toString());
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
