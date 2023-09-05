package com.mansoor.java.killer_java.functionalprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenderFinding {
    public static void main(String[] args) {
        List<Person> people= List.of(
                new Person("Ramu" ,Gender.Male),
                new Person("Swathi" ,Gender.Female),
                new Person("Jyostna" ,Gender.Female),
                new Person("Harish" ,Gender.Male)
        );
        List<Person> females = new ArrayList<>();
        System.out.println("// imperative approach");
        for(Person person : people){
                if (Gender.Female.equals(person.gender)){
                  females.add(person);
                }
        }

        for(Person female : females){
            System.out.println(female);
        }
        System.out.println("// Declarative approach");

      List<Person> females2=  people.stream()
                .filter(person->Gender.Female.equals(person.gender))
                .collect(Collectors.toList());
                females2 .forEach(System.out::println);
    }


    static  class Person{
        private  final String name;
        private  final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

    }
    enum Gender{
        Male,Female
    }
}
