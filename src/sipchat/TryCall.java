package sipchat;

public class TryCall implements SipState {

    SipChat sipChat;

    public TryCall(SipChat newSipChat) {

        sipChat = newSipChat;
    }

    @Override
    public void sendInvite(String invite) {

        System.out.println("Can't do a invite because we are in trycall state");
    }

    @Override
    public void sendTry(String strTry) {
        System.out.println("sending try");
    }

    @Override
    public void sendRinging(String ringing) {
        System.out.println("sending ringing");
    }

    @Override
    public void sendOK(String ok) {
        System.out.println("sending ok");
    }

    @Override
    public void sendBye(String bye) {
        //System.out.println();
    }

    @Override
    public void sendAck(String ack) {

        if(ack.equalsIgnoreCase("ack")) {
            sipChat.setSipState(sipChat.getTalking());
        }
    }

    @Override
    public void waitForMessage() {
/* Vi kommer vilja ha TRO och sedan anropa sendACK("ack)*/
        sendAck("ack");
    }

    @Override
    public void talk() {

    }
}
