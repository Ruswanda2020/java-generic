package javaGeneric.Application;

import javaGeneric.Util.MyData;

public class MyDataApp {
    public static void main(String[] args) {

        MyData<String> stringMyData=new MyData<String>("wanda");
        MyData<Integer> integerMyData=new MyData<Integer>(24);


        String valustring=stringMyData.getName();
        Integer valueinteger=integerMyData.getName();

        System.out.println(valueinteger);
        System.out.println(valustring);
    }
}
