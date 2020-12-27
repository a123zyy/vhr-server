package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Appraise")
@Data
public class Appraise {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer eid;

    /**
     * 考评日期
     */
    @ApiModelProperty(value = "考评日期")
    private Date appdate;

    /**
     * 考评结果
     */
    @ApiModelProperty(value = "考评结果")
    private String appresult;

    /**
     * 考评内容
     */
    @ApiModelProperty(value = "考评内容")
    private String appcontent;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}