package day07_05_23_2022.callCenter;
/*
Create a "WhatsApp" class that inherits VoiceCallable,VideoCallable and MessagingApp
        -implement required methods
 */

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{

    //we have default constructor here, super()-> it calls the non parameterized constr of super class

    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp - sending msg" + msg + "...");
    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp - making a video call...");
    }

    @Override
    public void call(String contact) {
        System.out.println("WhatsApp - calling " + contact + "...");
    }

    public void launch(){
        System.out.println("Launch method in WatsApp class");
    }
}
