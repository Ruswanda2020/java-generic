package javaGeneric.Util;

public class MyData <T>{
    private T name;

    public MyData(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
