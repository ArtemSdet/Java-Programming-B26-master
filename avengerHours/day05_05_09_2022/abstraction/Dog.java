package day05_05_09_2022.abstraction;
/*
Write a class Dog that extends the Animal class. Define 2 instance variables for this class: breed (String) and humanYears (int).

Add a constructor that accepts three String parameters. The value of the first is used to initialize the value of name, the value of the second is used to initialize age and the value of the third is used to initialize breed.
Use super() to call parent constructor.

Override toString() method, so it will display Dog info as in the example below:

Name: name Breed: breed Age in calendar years: years Age in human years: humanYears


Also, implement getAgeInHumanYears method, so It will convert dogs age into humans age as follows:

if the dog's age is less or equals to 2, multiple age by 11; otherwise, human years is equals to: 22 + ((age-2) * 5);

Create a equals() method for the Dog class that returns true if the dog’s name, age, and breed match the same variables for the other object that is being compared.
 */
public class Dog extends Animal{

    String breed;
    int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed=breed;
        getAgeInHumanYears();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", humanYears=" + humanYears +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int getAgeInHumanYears() {
        if(age<=2){
            humanYears = age*11;
        } else{
           humanYears = 22 + ((age-2) * 5);
        }
        return humanYears;
    }

    public boolean equals(Dog dog){

        if(this.age == dog.age && this.breed.equals(dog.breed) && this.name.equals(dog.name)){
            return true;
        }else
            return false;
    }

}
