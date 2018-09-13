package template;
public class MessageClient
{
    public static void main(String args[])
    {
        SlackMessage someSlackMessage = new SlackMessage();
        someSlackMessage.sendMessage();
        SkypeMessage someSkypeMessage = new SkypeMessage();
        someSkypeMessage.sendMessage();
    }
}
