package javaGeneric.Application;

public class ConstrainApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData=new NumberData<Integer>(22);
        NumberData<Long> longNumberData=new NumberData<>(24L);

      //NumberData<String> stringNumberData=new NumberData<String>("wanda"); EROR

    }

    public static class NumberData<T extends Number>{
        private T Data;

        public NumberData(T data) {
            Data = data;
        }

        public T getData() {
            return Data;
        }

        public void setData(T data) {
            Data = data;
        }
    }
}
