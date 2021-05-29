package org.example.vhr;

import com.github.pagehelper.util.StringUtil;
import lombok.Data;
import mob.push.api.client.push.PushV3Client;
import mob.push.api.config.MobPushConfig;
import mob.push.api.exception.ApiException;
import mob.push.api.http.Result;
import mob.push.api.res.PushV3Res;
import org.apache.commons.lang3.StringUtils;
import org.example.vhr.controller.until.JwtTokenUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

@SpringBootTest
public class SpringbootTest {

    @Autowired
    private HrService hrService;

    private final static int DATA = 0x9fa5 - 0x4e00 + 1;


    @Autowired
    private EmployeeService employeeService;


    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @Test
    public void getparamer(){
//        MobPushConfig.appkey = "2c574691c6986";
//        MobPushConfig.appSecret = "4b5cd595eb07b5cf17bb269f7a51391d";
//        try {
//            //Registration ID推送
//            Result<PushV3Res> resResult = PushV3Client.pushAll("", "彩蛋彩蛋", "这是一条M78星云的消息");
//            System.out.println(resResult.success());
//        } catch (ApiException e) {
//                e.getStatus();	   	   //错误请求状态码
//                e.getErrorCode();	       //错误状态码
//                e.getErrorMessage();        //错误信息
//        }

        System.out.println(2+(-1));
//                1941	javaboy	男	2019-11-24	610144199905056666	已婚	1		584991843@qq.com	18566667777	广东深圳	89	9	29	劳动合同	本科	计算机科学	深圳大学	2019-11-24	在职	00000065	3	2020-02-23		2019-11-24	2022-11-27

        for (int i =0;i<2000;i++){
            Employee employee = new Employee();
            employee.setAddress("广东"+i);
            employee.setName("php"+getRandomHan());
            employee.setGender("女");
            employee.setBirthday(new Date());
            employee.setIdCard("610144199905056667");
            employee.setWedlock("已婚");
            employee.setNationId(1);
            employee.setNativePlace("广州");
            employee.setPoliticId(6);
            employee.setEmail("45125863"+i+"@qq.com");
            employee.setPhone((System.currentTimeMillis()+"").substring(2));
            employee.setAddress("广州");
            employee.setDepartmentId(91);
            employee.setJobLevelId(12);
            employee.setPosId(34);
            employee.setEngageForm("劳无合同");
            employee.setTiptopDegree("本科");
            employee.setSpecialty("计算机应用技术");
            employee.setSchool("广东大学");
            employee.setBeginDate(new Date());
            employee.setWorkState("在职");
            employee.setWorkID((employeeService.getMaxWorkID()+1)+"");
            employee.setContractTerm(2.2);
            employee.setConversionTime(new Date());
            employee.setBeginDate(new Date());
            employee.setEndContract(new Date());
            employeeService.insertSelective(employee);
        }


    }

    @Test
    public void getparamname(){
        Hr hr = new Hr();
        hr.setName("yyy");
        hr.setId(1);
        String token =  jwtTokenUtil.generateToken(hr);
        System.out.println("==="+token);
        jwtTokenUtil.getNameFromToken(token);
    }

    @Test
    public void getthisa(){
        int[] aaa = new int[] {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
        minNumberInRotateArray(aaa);
    }




    //随机生成汉字
    public char getRandomHan () {
        Random ran = new Random();
        return (char) (0x4e00 + ran.nextInt(DATA));
    }

    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int num = array.length/2;
        int leng = array.length-1;
        int low = 0;
        int minnum = 0;
        while (leng>num) {
            if (array[low] >array [leng]){
                minnum = array[leng];
            } else {
                minnum = array[low];
            }
            leng --;
            low++;
        }
        System.out.println(minnum);
        System.out.println( array[num]);
        return minnum > array[num]? array[num] :minnum;
    }

    public class Solution {
        public int minNumberInRotateArray(int [] array) {
            int low = 0 ; int high = array.length - 1;
            while(low < high){
                int mid = low + (high - low) / 2;
                if(array[mid] > array[high]){
                    low = mid + 1;
                }else if(array[mid] == array[high]){
                    high = high - 1;
                }else{
                    high = mid;
                }
            }
            return array[low];
        }
    }
}
