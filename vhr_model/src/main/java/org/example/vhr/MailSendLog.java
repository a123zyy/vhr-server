package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-MailSendLog")
@Data
public class MailSendLog {
    @ApiModelProperty(value = "")
    private String msgid;

    @ApiModelProperty(value = "")
    private Integer empid;

    /**
     * 0发送中，1发送成功，2发送失败
     */
    @ApiModelProperty(value = "0发送中，1发送成功，2发送失败")
    private Integer status;

    @ApiModelProperty(value = "")
    private String routekey;

    @ApiModelProperty(value = "")
    private String exchange;

    /**
     * 重试次数
     */
    @ApiModelProperty(value = "重试次数")
    private Integer count;

    /**
     * 第一次重试时间
     */
    @ApiModelProperty(value = "第一次重试时间")
    private Date trytime;

    @ApiModelProperty(value = "")
    private Date createtime;

    @ApiModelProperty(value = "")
    private Date updatetime;
}