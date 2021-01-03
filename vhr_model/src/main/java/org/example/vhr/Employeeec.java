package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Employeeec")
@Data
public class Employeeec {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 员工编号
     */
    @ApiModelProperty(value = "员工编号")
    private Integer eid;

    /**
     * 奖罚日期
     */
    @ApiModelProperty(value = "奖罚日期")
    private Date ecdate;

    /**
     * 奖罚原因
     */
    @ApiModelProperty(value = "奖罚原因")
    private String ecreason;

    /**
     * 奖罚分
     */
    @ApiModelProperty(value = "奖罚分")
    private Integer ecpoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    @ApiModelProperty(value = "奖罚类别，0：奖，1：罚")
    private Integer ectype;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}