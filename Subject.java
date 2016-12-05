/**
 * Created by sandeep on 12/5/16.
 */
public interface Subject {
    void register(Observer newObserver);
    void unregister(Observer ObserverName);
    void notifyall();
}
