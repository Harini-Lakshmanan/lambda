package com.io.lambdas;

import java.util.Arrays;
import java.util.List;

public class CollectionSamples {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Harini","Lakshmanan",33),
                new Person("Santhosh","Sasi",33),
                new Person("Niveda","Santhosh",3)
        );

        System.out.println("for loop");
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }

        System.out.println("Advance for loop");
        for(Person p: people){
            System.out.println(p);
        }

        System.out.println("For each loop");
        people.forEach(person -> System.out.println(person));

        System.out.println("stream loop");
        people.stream().forEach(person -> System.out.println(person));
    }
}
