package com.ung8023.datatype;

public class NullUnSafe {

    public static void main(String[] args) {

        String name = getName();

        if (name == null) {
            System.out.println("can not be null");
        }else {
            System.out.println(getName().length());
        }
    }

    public static String getName() {
        return null;
    }
}
