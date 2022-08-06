package day21_04_26_2022;

import day21_04_26_2022.accessModifier.Person;

public class AccessModifier extends Person {
    public static void main(String[] args) {

        Person person=new Person();

        // 1- PUBLIC
        person.name="Mike";

        // 2- PRIVATE
        // person.age=0;   it is not visible

        // 3- DEFAULT --> in same package --> it is not in same package with Person
        //person.ID=1;


        //4- PROTECTED

        // - SAME PACKAGE
        //person.DoB="06.06.2006"; it is not in same package with Person

        // - INHERITANCE  -- There is no inheritance
         AccessModifier accessModifier=new AccessModifier();
         accessModifier.DoB="06.06.2006";
    }
}
