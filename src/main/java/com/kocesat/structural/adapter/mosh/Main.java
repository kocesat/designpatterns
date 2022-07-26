package com.kocesat.structural.adapter.mosh;

import com.kocesat.structural.adapter.mosh.tpfilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
