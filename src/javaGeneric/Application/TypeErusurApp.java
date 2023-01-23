package javaGeneric.Application;

import javaGeneric.Util.MyData;

public class TypeErusurApp {
    public static void main(String[] args) {

        MyData myData=new MyData("wanda");

        MyData<Integer> integerMyData=(MyData<Integer>)myData;
        Integer integer=integerMyData.getName();

    }


}
