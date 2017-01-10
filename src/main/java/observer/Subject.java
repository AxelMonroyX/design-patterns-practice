package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by axel on 9/01/17.
 * github.com/AxelMonroyX
 */
class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    int getState() {
        return state;
    }

    void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {

        for (Observer observer : observers) {
            observer.update();
        }
    }
}
