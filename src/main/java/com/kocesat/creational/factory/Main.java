package com.kocesat.creational.factory;

public class Main {
    public static void main(String[] args) {
        Website site = WebsiteFactory.newInstance("blog");
        System.out.println(site.getPages());

        site = WebsiteFactory.newInstance(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
