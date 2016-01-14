import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by YB on 13.01.2016.
 */
// OBSERVABLE

public class Magazine extends Observable {

    private String name = null;

    Magazine (String name) {
        this.name = name;
    }

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
        System.out.println("Magazine Notify Observers!!!");
    }
}
