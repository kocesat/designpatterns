package com.kocesat.creational.builder;

public class LunchOrder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public LunchOrder(LunchOrderBuilder builder) {
        this.bread = builder.getBread();
        this.condiments = builder.getCondiments();
        this.dressing = builder.getDressing();
        this.meat = builder.getMeat();
    }

    // for performance testing
    public LunchOrder(){}

    public static Builder builder() {
        return new Builder();
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

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        // if something required put into the Builder constructor
        private Builder() {}

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
}