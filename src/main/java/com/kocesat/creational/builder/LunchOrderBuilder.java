package com.kocesat.creational.builder;

public class LunchOrderBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBuilder() {}

    public LunchOrder build(){
        return new LunchOrder(this);
    }

    public LunchOrderBuilder withBread(String bread) {
        this.bread = bread;
        return this;
    }

    public LunchOrderBuilder withCondiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public LunchOrderBuilder withDressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public LunchOrderBuilder withMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
