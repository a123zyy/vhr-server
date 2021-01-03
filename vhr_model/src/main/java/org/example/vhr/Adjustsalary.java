package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Adjustsalary")
@Data
public class Adjustsalary {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer eid;

    /**
     * 调薪日期
     */
    @ApiModelProperty(value = "调薪日期")
    private Date asdate;

    /**
     * 调前薪资
     */
    @ApiModelProperty(value = "调前薪资")
    private Integer beforesalary;

    /**
     * 调后薪资
     */
    @ApiModelProperty(value = "调后薪资")
    private Integer aftersalary;

    /**
     * 调薪原因
     */
    @ApiModelProperty(value = "调薪原因")
    private String reason;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}