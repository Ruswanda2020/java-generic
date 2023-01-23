package javaGeneric.Application;

import javaGeneric.Util.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData=new MyData<>("wanda");
        //doit(stringMyData);EROR
        //MyData<Object>objectMyData=stringMyData;EROR
        MyData<Object>objectMyData=new MyData<>(100);
        //MyData<Integer> integerMyData=objectMyData;Eror
        //doitInteger(objectMyData);Eror
    }
    public static void doit(MyData<Object> objectMyData){
        //do nothing
    }
    public static void doitInteger(MyData<Integer> integerMyData){
        //do nothing
    }
}
