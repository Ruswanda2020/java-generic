package javaGeneric.Application;

import javaGeneric.Util.Person;

import java.util.Arrays;

public class ComperableApp {
    public static void main(String[] args) {

        Person[] people={
                new Person("wanda","pakistan"),
                new Person("ruswanda","INDONESIA"),
                new Person("wandi","malesia")

        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
