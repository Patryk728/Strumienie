package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Strumienie:
        //Stream<String> myStringStream = Stream.of("Ala","ma","kota");
        //myStringStream.forEach( s-> System.out.println(s));

        /*Stream
                .<String>builder()
                .add("Ala")
                .add("ma")
                .add("kota")
                .build()
                .filter(s -> s.startsWith("A"))
                .forEach(s -> System.out.println(s));

        Predicate<Person> nameStartWithAPredicate = p-> p.name.startsWith("A");
        Predicate<Person> ageBelow20Predicate = p->p.age<20;

        List<Person> people = Arrays.asList(
                new Person("Lukasz", 15),
                new Person("Mariusz", 25),
                new Person("Ala", 25),
                new Person("Ola", 23),
                new Person("Piotr", 13),
                new Person("Ewa", 55),
                new Person("Aleksander", 10),
                new Person("Aleksander", 17),
                new Person("Lukasz", 20)
        );

            people.stream()
                .filter(nameStartWithAPredicate.or(ageBelow20Predicate))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    */
/*
        List<String> upperCaseList = Arrays.asList("A","B","C","D");

        List<String> lowerCaseList = upperCaseList
                                        .stream()
                                        .map(String::toLowerCase)  //s->s.toLowerCase()
                                        .collect(Collectors.toList());
        System.out.println(upperCaseList);
        System.out.println(lowerCaseList);
*/
/*
                List<Person> personList = Arrays.asList(
                new Person("Adam","Nowak"),
                new Person("Piotr","Nowak"),
                new Person("Ewa","Lis"),
                new Person("Adam","Kot"),
                new Person("Mariusz","Lis")
                );

        List<Person> personsName = personList
                .stream()
                .map(person -> new Person(person.name.toUpperCase(),person.lastName.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println(personList);
        System.out.println(personsName);
  */

    //Flatmapa
    String [][] data = new String[][]{{"a","b"},{"c","d"},{"e","f"},{"e","f"},{"e","f"},{"e","f"}};

    Stream<String[]> strumienTablic = Arrays.stream(data);
    Stream<String> strumienStringow = strumienTablic.flatMap(arr -> Arrays.stream(arr));

    //strumien stringow
        //1. odfiltruj e
        //2. zmapuj do wielkiej litery
        //3. uzyj foreach i :: do wydrukowania elementow

                                    strumienStringow
                                        .filter(p -> p.equals("e"))
                                        .map(String::toUpperCase)
                                        .forEach(System.out::println);


    }




}
/*
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

 */

class Person{
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}