package sipchat;

public class ResponseCall implements  SipState {

    SipChat sipChat;

    public ResponseCall(SipChat newSipChat) {

        sipChat = newSipChat;
    }

    @Override
    public void sendInvite(String invite) {

    }

    @Override
    public void sendTry(String strTry) {

    }

    @Override
    public void sendRinging(String ringing) {

    }

    @Override
    public void sendOK(String ok) {

    }

    @Override
    public void sendBye(String bye) {

    }

    @Override
    public void sendAck(String ack) {

    }

    @Override
    public void waitForMessage() {

    }

    @Override
    public void talk() {

    }
}
