package org.example.vhr.controller.until;


import lombok.Data;

import java.util.List;
@Data
public class ResultController {
    private  List list;
    private  Integer pageNo;
    private  Integer pageSize;
    private Long total;
}
