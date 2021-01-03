package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(value = "org-example-vhr-Menu")
@Data
public class Menu {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private String url;

    @ApiModelProperty(value = "")
    private String path;

    @ApiModelProperty(value = "")
    private String component;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String iconcls;

    @ApiModelProperty(value = "")
    private Boolean keepalive;

    @ApiModelProperty(value = "")
    private Boolean requireauth;

    @ApiModelProperty(value = "")
    private Integer parentid;

    @ApiModelProperty(value = "")
    private Boolean enabled;

    private List<Menu> children;

    private meta meta;

}