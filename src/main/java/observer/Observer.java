package observer;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public abstract class Observer {
    protected Subject subject;
    MessageList messageList;

    public abstract void update();
}
