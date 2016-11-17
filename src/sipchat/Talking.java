package sipchat;

/**
 * Created by laic on 2016-11-17.
 */
public class Talking implements SipState {

    SipChat sipChat;

    public Talking(SipChat newSipChat) {

        sipChat = newSipChat;
    }

    @Override
    public void sendInvite(String invite) {
        System.out.println("Is already Talkin");
    }

    @Override
    public void sendTry(String strTry) {
        System.out.println("Is already Talkin");
    }

    @Override
    public void sendRinging(String ringing) {
        System.out.println("Is already Talkin");
    }

    @Override
    public void sendOK(String ok) {
        System.out.println("Is already Talkin");
    }

    @Override
    public void sendBye(String bye) {
        System.out.println("sending bye to Bob and wait for okej");
        sipChat.setSipState(sipChat.getWaiting());
    }

    @Override
    public void sendAck(String ack) {
        System.out.println("not gonna happen");
    }

    @Override
    public void waitForMessage() {
        System.out.println("Waiting for ett BYE from bob");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }
}
