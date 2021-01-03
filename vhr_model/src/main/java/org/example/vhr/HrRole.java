package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "org-example-vhr-HrRole")
@Data
public class HrRole {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer hrid;

    @ApiModelProperty(value = "")
    private Integer rid;
}