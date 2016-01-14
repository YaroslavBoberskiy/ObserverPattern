/**
 * Created by YB on 14.01.2016.
 */
public class Demo {
    public static void main(String [ ] args)
    {
        Newspaper times = new Newspaper("Times: ");
        Magazine forbes = new Magazine("Forbes: ");

        User timesSubscriber1 = new User(times, "Victor");
        User timesSubscriber2 = new User(times, "Oleg");
        User timesSubscriber3 = new User(times, "Olga");
        User timesSubscriber4 = new User(times, "Natalie");

        User timesSubscriber5 = new User(forbes, "Ivan");
        User timesSubscriber6 = new User(forbes, "Yakov");
        User timesSubscriber7 = new User(forbes, "Inga");
        User timesSubscriber8 = new User(forbes, "Vera");

        timesSubscriber1.subscribe();
        timesSubscriber2.subscribe();
        timesSubscriber3.subscribe();
        timesSubscriber4.subscribe();

        timesSubscriber5.subscribe();
        timesSubscriber6.subscribe();
        timesSubscriber7.subscribe();
        timesSubscriber8.subscribe();


        times.notifyObservers();
        forbes.notifyObservers();

        System.out.println("=========Unsubscribe Oleg and Olga - Times========");

        timesSubscriber2.unsubscribe();
        timesSubscriber3.unsubscribe();

        System.out.println("========Unsubscribe Yakov and Inga - Forbes========");

        timesSubscriber6.unsubscribe();
        timesSubscriber7.unsubscribe();

        times.notifyObservers();
        forbes.notifyObservers();
    }
}
