package javaGeneric.Application;

import javaGeneric.Util.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String,Integer>pair=new Pair<>("wanda",22);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
