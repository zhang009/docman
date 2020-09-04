package com.xf.docman.front.enums;

public enum DeleteEnum {
    DELETE(1, "删除"),
    NOT_DELETE(0, "未删除");

    private final Integer value;
    private final String desc;

    DeleteEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static boolean isDelete(Integer isDelete) {
        return DELETE.value.equals(isDelete);
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
