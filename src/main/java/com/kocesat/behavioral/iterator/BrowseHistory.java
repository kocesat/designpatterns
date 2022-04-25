package com.kocesat.behavioral.iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    /**
     * Puts a url into the visited urls
     * @param url
     */
    public void push(String url) {
        urls[count++] = url;
    }

//    public String pop() {
//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//        return lastUrl;
//    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index; //integer defaults to zero - not nullable

        // Dependency inversion principle in action
        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
