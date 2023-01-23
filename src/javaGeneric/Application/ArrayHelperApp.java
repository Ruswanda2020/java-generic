package javaGeneric.Application;

import javaGeneric.Util.ArrayHalper;

import java.security.SecureRandom;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] name={"ruswanda","dirgantara","palefi"};
        Integer[] numbers={23,34,45,555};

        System.out.println(ArrayHalper.count(name));
        System.out.println(ArrayHalper.count(numbers));
    }
}
