package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public class MessageList  {
    List messages = new LinkedList();
    public void add(String message) {
        this.messages.add(message);
    }

    public List getMessages() {
        return messages;
    }
}
