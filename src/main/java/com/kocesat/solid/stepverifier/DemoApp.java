package com.kocesat.solid.stepverifier;

public class DemoApp {
    public static void main(String[] args) {
        Verifiable impl = new VerifyImpl("A", "B");
        StepVerifier
                .create(impl)
                .verifyFirst("A")
                .verifySecond("B")
                .expectComplete();
    }
}
