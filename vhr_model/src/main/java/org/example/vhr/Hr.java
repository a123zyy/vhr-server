package org.example.vhr;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "org-example-vhr-Hr")
@Data
public class Hr {
    /**
     * hrID
     */
    @ApiModelProperty(value = "hrID")
    private Integer id;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String phone;

    /**
     * 住宅电话
     */
    @ApiModelProperty(value = "住宅电话")
    private String telephone;

    /**
     * 联系地址
     */
    @ApiModelProperty(value = "联系地址")
    private String address;

    @ApiModelProperty(value = "")
    private Boolean enabled;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "")
    private String userface;

    @ApiModelProperty(value = "")
    private String remark;
}