package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class FlywaySchemaHistory {
    private Integer installedRank;

    private String version;

    private String description;

    private String type;

    private String script;

    private Integer checksum;

    private String installedBy;

    private Date installedOn;

    private Integer executionTime;

    private Boolean success;
}