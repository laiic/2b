package sipchat;

public class Waiting implements SipState {

    SipChat sipChat;

    public Waiting(SipChat newSipChat) {

        sipChat = newSipChat;
    }


    @Override
    public void sendInvite(String invite) {
        System.out.println("Sending invite and changing state");

        if(invite.equalsIgnoreCase("invite")) {

            sipChat.setSipState(sipChat.getTryCalling());
        }
    }

    @Override
    public void sendTry(String strTry) {
        System.out.println("Cant send bye (we are in waiting)");
    }

    @Override
    public void sendRinging(String ringing) {
        System.out.println("Cant send bye (we are in waiting)");
    }

    @Override
    public void sendOK(String ok) {
        System.out.println("Cant send bye (we are in waiting)");
    }

    @Override
    public void sendBye(String bye) {
        System.out.println("Cant send bye (we are in waiting)");
    }

    @Override
    public void sendAck(String ack) {
        System.out.println("Cant send bye (we are in waiting)");
    }

    @Override
    public void waitForMessage() {
        System.out.println("if message == invite");
        sipChat.setSipState(sipChat.getTryCalling());
    }

    @Override
    public void talk() {
        System.out.println("Cant send bye (we are in waiting)");
    }
}
