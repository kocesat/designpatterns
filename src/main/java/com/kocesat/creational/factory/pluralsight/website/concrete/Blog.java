package com.kocesat.creational.factory.pluralsight.website.concrete;

import com.kocesat.creational.factory.pluralsight.page.concrete.AboutPage;
import com.kocesat.creational.factory.pluralsight.page.concrete.ContactPage;
import com.kocesat.creational.factory.pluralsight.page.concrete.PostPage;
import com.kocesat.creational.factory.pluralsight.website.Website;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new PostPage());
        pages.add(new ContactPage());
    }
}
