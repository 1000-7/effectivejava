package info.unclewang.chapter02.e02;

import com.google.common.base.MoreObjects;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("sauceInside", sauceInside)
                .add("toppings", toppings)
                .toString();
    }
}
