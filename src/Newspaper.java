import java.util.ArrayList;

/**
 * Created by YB on 13.01.2016.
 */

// OBSERVABLE
                                   // observable
public class Newspaper implements Subscriable {

    private String name = null;

    private ArrayList<User> subscribers = new ArrayList<User>();

    private boolean isIssuedNewEdition = false;

    public boolean isIssuedNewEdition() {
        return isIssuedNewEdition;
    }

    Newspaper (String name) {
        this.name = name;
    }

    public void setIssuedNewEdition(boolean isIssuedNewEdition) {
        this.isIssuedNewEdition = isIssuedNewEdition;
        if (isIssuedNewEdition == true) {
            notifyAboutIssueOfNewEdition();
        }
    }

    @Override
    public void addSubscriber(User s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(User s) {
        subscribers.remove(s);
    }

    @Override
    public void notifyAboutIssueOfNewEdition() {
        for (User subscriber : subscribers) {
            System.out.print(name);
            subscriber.update();
        }
    }
}
