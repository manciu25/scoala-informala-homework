package com.ioconcurrency;
/**
 * Enum that holds the sex
 * */
public enum Gender {
    male(0), female(1);

    private final int type;

    Gender(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static Gender valueOfType(int label) {
        for (Gender e : values()) {
            if (e.type == label) {
                return e;
            }
        }
        return null;
    }
}