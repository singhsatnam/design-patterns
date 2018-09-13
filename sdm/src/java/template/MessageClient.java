package template;
import junit.framework.TestCase;

public class MessageClient extends TestCase
{
    public static void main(String args[])
    {
        SlackMessage someSlackMessage = new SlackMessage();
        someSlackMessage.send();
        SkypeMessage someSkypeMessage = new SkypeMessage();
        someSkypeMessage.send();
    }
}
