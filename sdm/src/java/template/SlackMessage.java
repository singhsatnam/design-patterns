package src.java.template;
import static src.java.utilities.Utilities.print;
public class SlackMessage extends SendMessage
{

    protected void serializeMessage() {
        print("Message serialized and confirms to Slack format");
    }

    protected void makeHTTPRequest() {
        print("Making POST request...");
    }

    protected void verifyResponse() {
        print("Response 200 OK");
    }
}
