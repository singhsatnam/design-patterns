package template;

public abstract class SendMessage // Message
{
    public final void sendMessage() // send()
    {
        serializeMessage();
        makeHTTPRequest();
        verifyResponse();
    }
    protected abstract void serializeMessage();
    protected abstract void makeHTTPRequest();
    protected abstract void verifyResponse();
// Format/Layout
}
