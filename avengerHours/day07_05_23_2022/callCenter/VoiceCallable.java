package day07_05_23_2022.callCenter;
/*
-Create an Interface "VoiceCallable"
        -instance variable : public static final boolean CAN_CALL=true;
        -abstract method : void call(String contact)
        -static method : void decline()
        -default method : void accept()
 */
public interface VoiceCallable {
    boolean CAN_CALL = true ;

    void call(String contact);

    static void decline(){
        System.out.println("Mike declined voice call...");
    }

    default void accept(){ //default is the keyword to specify that it is a default method, not the access modifier
        System.out.println("Mike finally accepted voice call..");
    }

}
