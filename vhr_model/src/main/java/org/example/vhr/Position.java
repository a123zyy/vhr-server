package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Position")
@Data
public class Position {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 职位
     */
    @ApiModelProperty(value = "职位")
    private String name;

    @ApiModelProperty(value = "")
    private Date createdate;

    @ApiModelProperty(value = "")
    private Boolean enabled;
}