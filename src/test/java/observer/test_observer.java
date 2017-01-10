package observer;

import org.junit.Test;

import java.util.LinkedList;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
public class test_observer {
    @Test
    public void test_Observer() throws Exception {
        Subject subject = new Subject();
        MessageList messageList = new MessageList();

        new MetaObserver(subject, messageList);
        new SuperObserver(subject, messageList);
        assertEquals(new LinkedList(), messageList.getMessages());

        subject.setState(15);
        assertEquals(15, subject.getState());
        assertEquals("[METAOBSERVER, SUPEROBSERVER]", messageList.getMessages().toString());

        subject.setState(10);
        assertEquals(10, subject.getState());
        assertEquals("[METAOBSERVER, SUPEROBSERVER, METAOBSERVER, SUPEROBSERVER]", messageList.getMessages().toString());

    }
}
