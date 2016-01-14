/**
 * Created by YB on 13.01.2016.
 */
public class User implements Subscriber {

    private Subscriable subscriable = null;
    private String username = null;

    public User (Subscriable subscriable, String username) {
        this.subscriable = subscriable;
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Send issued new edition to: "+username);
    }

    public void subscribe () {
        subscriable.addSubscriber(this);
    }

    public void unsubscribe () {
        subscriable.removeSubscriber(this);
    }

}
