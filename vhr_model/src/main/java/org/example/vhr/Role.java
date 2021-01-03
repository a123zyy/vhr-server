package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Role")
@Data
public class Role {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String name;

    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String namezh;
}