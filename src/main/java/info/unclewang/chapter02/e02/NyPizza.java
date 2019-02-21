package info.unclewang.chapter02.e02;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {
        SMALL, MEDIUM, Large
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    NyPizza(Builder builder) {
        super(builder);
    }


}
