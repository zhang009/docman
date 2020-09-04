package com.xf.docman.front.enums;

/**
 *
 */
public enum EnableEnum {

    ENABLE(1, "启用"),

    DISABLE(0, "禁用");

    private final Integer value;
    private final String desc;

    EnableEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static boolean isEnalbe(Integer isEnable) {
        return ENABLE.value.equals(isEnable);
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
