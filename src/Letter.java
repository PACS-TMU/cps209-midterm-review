// Extend class to the Document class and add 2 new fields
// 1. Sender
// 2. Receiver
// Also create getters and setters for the two new fields.
// Overrider the setBody to include "Dear " + receiver + "\n\n" + body + "\n\nSincerely,\n" + sender
public class Letter extends Document
{
    private String sender;
    private String receiver;

    public Letter(String id)
    {
        super(id);
        this.sender = "";
        this.receiver = "";
    }

    public String getSender()
    {
        return sender;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void setBody(String body)
    {
        super.setBody("Dear " + receiver + "\n\n" + body + "\n\nSincerely,\n" + sender);
    }

}
