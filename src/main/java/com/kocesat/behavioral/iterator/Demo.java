package com.kocesat.behavioral.iterator;

public class Demo {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("url 1");
        history.push("url 2");
        history.push("url 3");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
