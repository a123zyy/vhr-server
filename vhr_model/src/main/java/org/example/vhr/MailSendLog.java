package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class MailSendLog {
    private String msgid;

    private Integer empid;

    /**
     * 0发送中，1发送成功，2发送失败
     */
    private Integer status;

    private String routekey;

    private String exchange;

    /**
     * 重试次数
     */
    private Integer count;

    /**
     * 第一次重试时间
     */
    private Date trytime;

    private Date createtime;

    private Date updatetime;
}