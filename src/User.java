import java.util.Observable;
import java.util.Observer;

/**
 * Created by YB on 13.01.2016.
 */
public class User implements Observer {

    private Observable subscriable = null;
    private String username = null;

    public User (Observable subscriable, String username) {
        this.subscriable = subscriable;
        this.username = username;
    }

    public void subscribe () {
        subscriable.addObserver(this);
    }

    public void unsubscribe () {
        subscriable.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Send issued new edition to: " + username);
    }
}
