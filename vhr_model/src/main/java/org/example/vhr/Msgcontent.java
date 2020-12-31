package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class Msgcontent {
    private Integer id;

    private String title;

    private String message;

    private Date createdate;
}