package sipchat;

public interface SipState {

    void sendInvite(String invite);
    void sendTry(String strTry);
    void sendRinging(String ringing);
    void sendOK(String ok);
    void sendBye(String bye);
    void sendAck(String ack);
    void waitForMessage();
    void talk();
}
