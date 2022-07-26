package com.kocesat.structural.adapter.mosh;

import com.kocesat.structural.adapter.mosh.tpfilters.Caramel;

/**
 * Acts as Adapter
 * Composition method
 */
public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
