package observer;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
class MetaObserver extends Observer {

    MetaObserver(Subject subject, MessageList messageList) {
        this.subject = subject;
        this.subject.addObserver(this);
        this.messageList = messageList;

    }

    @Override
    public void update() {
        this.messageList.add("METAOBSERVER");
    }
}
