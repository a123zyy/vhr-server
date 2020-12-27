package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Employeetrain")
@Data
public class Employeetrain {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 员工编号
     */
    @ApiModelProperty(value = "员工编号")
    private Integer eid;

    /**
     * 培训日期
     */
    @ApiModelProperty(value = "培训日期")
    private Date traindate;

    /**
     * 培训内容
     */
    @ApiModelProperty(value = "培训内容")
    private String traincontent;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}