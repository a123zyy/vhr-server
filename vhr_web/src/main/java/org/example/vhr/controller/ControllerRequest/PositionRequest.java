package org.example.vhr.controller.ControllerRequest;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.example.vhr.Position;

import java.util.Date;

public class PositionRequest extends Position {

    private Date createDate;

}
