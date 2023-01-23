package javaGeneric.Application;

import javaGeneric.Util.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        Person[] people={
                new Person("wanda","pakistan"),
                new Person("ruswanda","INDONESIA"),
                new Person("wandi","malesia")

        };

        Comparator<Person> comparator=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddres().compareTo(o2.getAddres());
            }
        };

        Arrays.sort(people,comparator);
        System.out.println(Arrays.toString(people));
    }

}
