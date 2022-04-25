package com.kocesat.creational.factory;

public class WebsiteFactory {
    public static Website newInstance(String siteType) {
        switch (siteType) {
            case "blog":
                return new Blog();
            case "shop":
                return new Shop();
            default:
                return null;
        }
    }

    public static Website newInstance(WebsiteType type) {
        switch (type) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
