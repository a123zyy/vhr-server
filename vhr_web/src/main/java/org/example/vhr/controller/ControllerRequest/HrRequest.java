package org.example.vhr.controller.ControllerRequest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.example.vhr.Hr;
import org.example.vhr.Role;

import java.util.List;

@Data
public class HrRequest extends Hr {

    @JsonIgnore
    private String password;

    private List<Role> roles;

}
