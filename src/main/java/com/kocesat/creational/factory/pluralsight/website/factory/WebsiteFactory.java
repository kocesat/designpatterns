package com.kocesat.creational.factory.pluralsight.website.factory;

import com.kocesat.creational.factory.pluralsight.enums.WebsiteType;
import com.kocesat.creational.factory.pluralsight.website.Website;
import com.kocesat.creational.factory.pluralsight.website.concrete.Blog;
import com.kocesat.creational.factory.pluralsight.website.concrete.Shop;

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
