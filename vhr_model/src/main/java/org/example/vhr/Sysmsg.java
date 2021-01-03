package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Sysmsg")
@Data
public class Sysmsg {
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 消息id
     */
    @ApiModelProperty(value = "消息id")
    private Integer mid;

    /**
     * 0表示群发消息
     */
    @ApiModelProperty(value = "0表示群发消息")
    private Integer type;

    /**
     * 这条消息是给谁的
     */
    @ApiModelProperty(value = "这条消息是给谁的")
    private Integer hrid;

    /**
     * 0 未读 1 已读
     */
    @ApiModelProperty(value = "0 未读 1 已读")
    private Integer state;
}