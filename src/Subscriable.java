/**
 * Created by YB on 13.01.2016.
 */
public interface Subscriable {

    public void addSubscriber(User s);

    public void removeSubscriber(User s);
    
    public void notifyAboutIssueOfNewEdition();

}
