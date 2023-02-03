package com.kocesat.solid.stepverifier;

public class StepVerifier {
    private Verifiable verifiable;

    private StepVerifier(Verifiable verifiable) {
        this.verifiable = verifiable;
    }

    public static StepVerifier create(Verifiable verifiable) {
        return new StepVerifier(verifiable);
    }

    public StepVerifier verifyFirst(String input) {
        if (verifiable.verifyFirstStep(input)) {
            System.out.println("First test passed");
            return this;
        }
        throw new IllegalArgumentException("Not verified");
    }

    public StepVerifier verifySecond(String input) {
        if (verifiable.verifySecondStep(input)) {
            System.out.println("Second test passed");
            return this;
        }
        throw new IllegalArgumentException("Not verified");
    }

    public void expectComplete() {
        System.out.println("All verification passed");
    }
}
