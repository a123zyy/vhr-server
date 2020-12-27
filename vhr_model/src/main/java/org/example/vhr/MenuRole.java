package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "org-example-vhr-MenuRole")
@Data
public class MenuRole {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer mid;

    @ApiModelProperty(value = "")
    private Integer rid;
}