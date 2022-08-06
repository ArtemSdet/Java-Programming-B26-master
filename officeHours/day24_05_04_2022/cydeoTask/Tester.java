package day24_05_04_2022.cydeoTask;

public final class Tester extends Employee{

    /*

      1. Tester
       variables: name, gender, age, jobTitle, employeeID, salary
       methods: work(), attendMeeting()
     */

    public Tester(String name, char gender, int age, String jobTitle, int employeeID, double salary) {
        super(name, gender, age, jobTitle, employeeID, salary);
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attending Meetings");

    }

    @Override
    public void drink(String beverage) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+beverage);    }
}
