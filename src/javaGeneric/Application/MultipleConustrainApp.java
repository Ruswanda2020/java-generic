package javaGeneric.Application;

public class MultipleConustrainApp {

    public static void main(String[] args) {

        //meneger tidak implement CanSayHallO jad EROR
        //Data<Maneger> manegerData=new Data<>(new Maneger());

        Data<VicePersident> vicePersidentData=new Data<>(new VicePersident());

    }
    public  static interface CanSayHallo{
        void SayHallo(String name);
    }

    public static abstract class Employe{

    }
    public static class Maneger extends Employe{

    }
    public static class VicePersident extends Employe implements CanSayHallo{

        @Override
       public void SayHallo( String name){
            System.out.println("Hallo "+name);
        }

    }
    public static class Data<T extends Employe & CanSayHallo>{

        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
