package org.example.vhr.controller.config.enums;

public enum  RewardAndPunishmentEnum {
    IS_STATUS(1,"在线"),NO_STATUS(0,"离线"),CANCEL_STATUS(3,"已取消");
    public final int val;
    private final String desc;

    @Override
    public String toString() {
        return "RewardAndPunishmentEnum{" +
                "val=" + val +
                ", desc='" + desc + '\'' +
                '}';
    }

    RewardAndPunishmentEnum(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }
}
