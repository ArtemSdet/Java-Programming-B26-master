package day24_05_04_2022.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Student student=new Student("Mike",'M',25,1,"Cydeo");

        System.out.println(student);

        Tester tester=new Tester("John",'M',25,"Tester",1,150000);

        // OVERRIDEN METHODS
        tester.attendMeeting();
        tester.work();
        tester.drink("coffee");

        // COMES FROM PARENTS
        tester.eat("pizza");
        tester.sleep();



    }
}
