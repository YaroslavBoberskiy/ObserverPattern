import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by YB on 13.01.2016.
 */

// OBSERVABLE
                                   // observable
public class Newspaper extends Observable {

    private String name = null;

    Newspaper (String name) {
        this.name = name;
    }

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
        System.out.println("Newspaper Notify Observers!!!");
    }
}

