package javaGeneric.Application;

import javaGeneric.Util.MyData;

public class CovariatApp {
    public static void main(String[] args) {

        MyData<String> myDatastring=new MyData<>("wanda");
        proses(myDatastring);

        MyData<?extends Object> myData=myDatastring;

    }

    public static void proses(MyData<?extends Object> myData){
        System.out.println(myData.getName());
        //myData.setName("1");tidak boleh karna berbahaya
    }
}
