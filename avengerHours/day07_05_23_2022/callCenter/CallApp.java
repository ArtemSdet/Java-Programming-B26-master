package day07_05_23_2022.callCenter;
/*
 -Create a "CallApp" class that inherits the VoiceCallable and MessagingApp
        -implement the required methods
 */

public class CallApp extends MessagingApp implements VoiceCallable {


    @Override
    public void sendMessage(String msg) {
        System.out.println("CallApp - sending msg " + msg);
    }

    @Override
    public void call(String contact) {
        System.out.println("CallApp - calling " + contact + "..." );
    }
}
