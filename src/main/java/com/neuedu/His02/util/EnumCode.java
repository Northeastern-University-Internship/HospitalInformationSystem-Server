package com.neuedu.His02.util;


public enum EnumCode {

    OK(200),

    LOGIN_FAIL(303),

    BAD_REQUEST(400),

    UNAUTHORIZED(401),

    FORBIDDEN(403),

    GONE(410),

    LOCKED(423),

    INTERNAL_SERVER_ERROR(500),


    EXCPTION_ERROR(4001);

    private final Integer value;

    private EnumCode(Integer value) {
        this.value = value;
    }


    public Integer getValue() {
        return this.value;
    }
}
