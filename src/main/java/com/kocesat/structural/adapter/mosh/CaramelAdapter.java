package com.kocesat.structural.adapter.mosh;

import com.kocesat.structural.adapter.mosh.tpfilters.Caramel;

/**
 * Adapter pattern can also be used by inheritance
 * This is an example of applying by inheritance
 * (Composition method implemented by CaramelFilter class)
 * Choose composition vs inheritance based on your needs
 * But in general composition method is better
 */
public class CaramelAdapter extends Caramel implements Filter{
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
