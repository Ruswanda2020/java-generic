package javaGeneric.Application;

import javaGeneric.Util.MyData;

public class WildCardeApp {
    public static void main(String[] args) {

        printLenght(new MyData<Integer>(100));
        printLenght(new MyData<String>("wanda"));
        printLenght(new MyData<Float>(45F));




    }
    public static void printLenght(MyData<?> myData){
        System.out.println(myData.getName());
    }

}
