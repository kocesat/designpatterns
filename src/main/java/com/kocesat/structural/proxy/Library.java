package com.kocesat.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebookMap = new HashMap<>();

    public void openEbook(String fileName) {
        ebookMap.get(fileName).show();
    }

    public void add(Ebook ebook) {
        ebookMap.put(ebook.getFileName(), ebook);
    }

}
