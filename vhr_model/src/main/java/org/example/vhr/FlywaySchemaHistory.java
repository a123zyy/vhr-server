package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "org-example-vhr-FlywaySchemaHistory")
@Data
public class FlywaySchemaHistory {
    @ApiModelProperty(value = "")
    private Integer installedRank;

    @ApiModelProperty(value = "")
    private String version;

    @ApiModelProperty(value = "")
    private String description;

    @ApiModelProperty(value = "")
    private String type;

    @ApiModelProperty(value = "")
    private String script;

    @ApiModelProperty(value = "")
    private Integer checksum;

    @ApiModelProperty(value = "")
    private String installedBy;

    @ApiModelProperty(value = "")
    private Date installedOn;

    @ApiModelProperty(value = "")
    private Integer executionTime;

    @ApiModelProperty(value = "")
    private Boolean success;
}