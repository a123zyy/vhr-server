package org.example.vhr.controller.config.enums;

public enum  WageEnum {
    IS_STATUS(1,"已生效"),NO_STATUS(0,"未生效");
    public final int val;
    private final String desc;

    @Override
    public String toString() {
        return "WageEnum{" +
                "val=" + val +
                ", desc='" + desc + '\'' +
                '}';
    }

    WageEnum(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }
}
