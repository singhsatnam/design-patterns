package template;

public abstract class SendMessage
{
    public final void sendMessage()
    {
        serializeMessage();
        makeHTTPRequest();
        verifyResponse();
    }
    protected abstract void serializeMessage();
    protected abstract void makeHTTPRequest();
    protected abstract void verifyResponse();

}
