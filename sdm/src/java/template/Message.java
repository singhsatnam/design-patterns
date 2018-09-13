package template;

public abstract class Message
{
    public final void send()
    {
        serializeMessage();
        makeHTTPRequest();
        verifyResponse();
    }
    protected abstract void serializeMessage();
    protected abstract void makeHTTPRequest();
    protected abstract void verifyResponse();
}
