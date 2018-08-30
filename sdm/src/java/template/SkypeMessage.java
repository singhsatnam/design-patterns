package src.java.template;

import static src.java.utilities.Utilities.print;

public class SkypeMessage extends SendMessage
{
    protected void serializeMessage() {
        print("Message serialized and confirms to Skype format");
    }

    protected void makeHTTPRequest() {
        print("Making POST request...");
    }

    protected void verifyResponse() {
        print("Response 403 Server busy");
    }
}
