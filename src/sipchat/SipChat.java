package sipchat;

public class SipChat {

    SipState waiting;
    SipState respondeCall;
    SipState talking;
    SipState tryCall;

    SipState sipState;

    public SipChat() {

        waiting = new Waiting(this);
        respondeCall = new ResponseCall(this);
        talking = new Talking(this);
        tryCall = new TryCall(this);

        sipState = waiting;
    }


    public void setSipState(SipState newSipState) {
        sipState = newSipState;
    }

    public void sendInvite(String invite) {
        sipState.sendInvite(invite);

    }

    public void sendTry(String strTry) {
        sipState.sendTry(strTry);
    }

    public void sendRinging(String ringing) {
        sipState.sendRinging(ringing);
    }

    public void sendOK(String ok) {
        sipState.sendOK(ok);
    }

    public void sendBye(String bye) {
        sipState.sendBye(bye);
    }

    public void sendAck(String ack) {
        sipState.sendAck(ack);
    }

    public void talk() {
        sipState.talk();
    }

    public void waitForMessage() {
        sipState.waitForMessage();
    }


    public SipState getWaiting() {
        System.out.println("We are in Waiting state");
        return waiting;
    }

    public SipState getRespondingCall() {
        System.out.println("We are in RespondCall state");
        return respondeCall;
    }

    public SipState getTryCalling() {
        System.out.println("We are in TryCall state");
        return tryCall;
    }

    public SipState getTalking() {
        System.out.println("We are in Talking state");
        return talking;
    }

}
