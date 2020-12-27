package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Oplog")
@Data
public class Oplog {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 添加日期
     */
    @ApiModelProperty(value = "添加日期")
    private Date adddate;

    /**
     * 操作内容
     */
    @ApiModelProperty(value = "操作内容")
    private String operate;

    /**
     * 操作员ID
     */
    @ApiModelProperty(value = "操作员ID")
    private Integer hrid;
}