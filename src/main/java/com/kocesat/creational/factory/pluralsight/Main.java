package com.kocesat.creational.factory.pluralsight;

import com.kocesat.creational.factory.pluralsight.enums.WebsiteType;
import com.kocesat.creational.factory.pluralsight.website.Website;
import com.kocesat.creational.factory.pluralsight.website.concrete.Blog;
import com.kocesat.creational.factory.pluralsight.website.factory.WebsiteFactory;

public class Main {
    public static void main(String[] args) {
        Website site = WebsiteFactory.newInstance("blog");
        Website blog = new Blog();
        System.out.println(blog.getPages());

        site = WebsiteFactory.newInstance(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
