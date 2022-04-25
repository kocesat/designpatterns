package com.kocesat.creational.factory;

import java.util.stream.Stream;

public enum WebsiteType {
    BLOG(1, "blog"),
    SHOP(2, "shop");

    private int code;
    private String text;

    WebsiteType(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public static WebsiteType getEnumFromCode(Integer code) {
        if (code == null) {
            return null;
        }
        return Stream.of(WebsiteType.values())
                .filter(c -> c.getCode() == code)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public int getCode() {
        return code;
    }

    public String getText() {
        return text;
    }
}
