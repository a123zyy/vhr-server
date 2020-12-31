package org.example.vhr;

import lombok.Data;

@Data
public class Sysmsg {
    private Integer id;

    /**
     * 消息id
     */
    private Integer mid;

    /**
     * 0表示群发消息
     */
    private Integer type;

    /**
     * 这条消息是给谁的
     */
    private Integer hrid;

    /**
     * 0 未读 1 已读
     */
    private Integer state;
}