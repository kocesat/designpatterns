package com.kocesat.solid.stepverifier;

public class VerifyImpl implements Verifiable {
    private String firstStr;
    private String secondStr;

    public VerifyImpl(String firstStr, String secondStr) {
        this.firstStr = firstStr;
        this.secondStr = secondStr;
    }

    @Override
    public boolean verifyFirstStep(String firstStr) {
        return this.firstStr.equals(firstStr);
    }

    @Override
    public boolean verifySecondStep(String secondStr) {
        return this.secondStr.equals(secondStr);
    }
}
