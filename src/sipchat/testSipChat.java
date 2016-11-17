package sipchat;

public class testSipChat {

    public static void main(String[] args) {

        SipChat chat = new SipChat();

        chat.sendInvite("INVITE");
        chat.sendAck("ack");


    }
}
