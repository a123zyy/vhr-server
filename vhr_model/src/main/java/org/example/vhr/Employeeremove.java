package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Employeeremove")
@Data
public class Employeeremove {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer eid;

    /**
     * 调动后部门
     */
    @ApiModelProperty(value = "调动后部门")
    private Integer afterdepid;

    /**
     * 调动后职位
     */
    @ApiModelProperty(value = "调动后职位")
    private Integer afterjobid;

    /**
     * 调动日期
     */
    @ApiModelProperty(value = "调动日期")
    private Date removedate;

    /**
     * 调动原因
     */
    @ApiModelProperty(value = "调动原因")
    private String reason;

    @ApiModelProperty(value = "")
    private String remark;
}