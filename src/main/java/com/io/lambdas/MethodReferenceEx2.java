package com.io.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodReferenceEx2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Harini","Lakshmanan",33),
                new Person("Santhosh","Sasi",33),
                new Person("Niveda","Santhosh",3)
        );

        //Step 1: Sorting list with lastname
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        //Create a method which prints all elements on list
        printAll(people);

        //Create a method which prints all elements in list which begins with S
        printListWithConditions(people,p -> p.getLastName().startsWith("S"));
        printListWithConditions(people,p -> p.getLastName().startsWith("L"));
        printListWithConditions(people,p->true);
    }

    private static void printListWithConditions(List<Person> people, Predicate<Person> predicate) {
        List<Person> filteredList = people.stream().filter(person -> predicate.test(person)).collect(Collectors.toList());
        System.out.println("Filtered List"+filteredList);
    }

    private static void printAll(List<Person> people) {
        people.stream().forEach(person ->
        {
            System.out.println("Each person"+person);
        });
    }
}
