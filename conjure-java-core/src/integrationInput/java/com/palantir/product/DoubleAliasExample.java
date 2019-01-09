package com.palantir.product;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

@Generated("com.palantir.conjure.java.types.AliasGenerator")
@ParametersAreNonnullByDefault
public final class DoubleAliasExample {
    private final double value;

    private DoubleAliasExample(double value) {
        this.value = value;
    }

    @JsonValue
    public double get() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object other) {
        return this == other
                || (other instanceof DoubleAliasExample
                        && this.value == ((DoubleAliasExample) other).value);
    }

    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }

    public static DoubleAliasExample valueOf(String value) {
        return new DoubleAliasExample(Double.parseDouble(value));
    }

    @JsonCreator
    public static DoubleAliasExample of(double value) {
        return new DoubleAliasExample(value);
    }

    @JsonCreator
    public static DoubleAliasExample of(int value) {
        return new DoubleAliasExample((double) value);
    }

    @JsonCreator
    public static DoubleAliasExample of(String value) {
        switch (value) {
            case "NaN":
                return DoubleAliasExample.of(Double.NaN);
            case "Infinity":
                return DoubleAliasExample.of(Double.POSITIVE_INFINITY);
            case "-Infinity":
                return DoubleAliasExample.of(Double.NEGATIVE_INFINITY);
            default:
                throw new IllegalArgumentException(
                        "Cannot deserialize string into double: " + value);
        }
    }
}
