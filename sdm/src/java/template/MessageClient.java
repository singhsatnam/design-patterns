package src.java.template;
public class MessageClient // extends TestCase
{
    public static void main(String args[])
    {
        SlackMessage someSlackMessage = new SlackMessage();
        someSlackMessage.sendMessage();
        SkypeMessage someSkypeMessage = new SkypeMessage();
        someSkypeMessage.sendMessage();
    }
}
