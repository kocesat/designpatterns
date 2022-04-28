package com.kocesat.creational.factory.pluralsight.website.concrete;

import com.kocesat.creational.factory.pluralsight.page.concrete.AboutPage;
import com.kocesat.creational.factory.pluralsight.page.concrete.CartPage;
import com.kocesat.creational.factory.pluralsight.page.concrete.ContactPage;
import com.kocesat.creational.factory.pluralsight.website.Website;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new ContactPage());
    }
}
