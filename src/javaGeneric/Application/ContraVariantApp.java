package javaGeneric.Application;

import javaGeneric.Util.MyData;

public class ContraVariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData=new MyData<>("wanda");
        objectMyData.setName(100);
        MyData<?super String> myData=objectMyData;

        proses(objectMyData);
        System.out.println(objectMyData.getName());

    }
    public static void proses(MyData<? super String> mydata){

        //String value=(String) mydata.getName();
        Object value=mydata.getName();
        System.out.println("PROSES PARAMETER " +value);
        mydata.setName("wandi");
    }
}
