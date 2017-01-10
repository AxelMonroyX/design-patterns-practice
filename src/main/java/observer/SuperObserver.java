package observer;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
class SuperObserver extends Observer {

    SuperObserver(Subject subject, MessageList messageList) {
        this.subject = subject;
        this.subject.addObserver(this);
        this.messageList = messageList;
    }

    @Override
    public void update() {
        this.messageList.add("SUPEROBSERVER");
    }
}
