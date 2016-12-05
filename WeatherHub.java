import java.util.ArrayList;

/**
 * Created by sandeep on 12/5/16.
 */
public class WeatherHub implements Subject {

    private ArrayList <Observer> observers;

    private double m_usaTemp;
    private double m_ukTemp;
    private double m_indiaTemp;



    WeatherHub(){

        observers = new ArrayList<Observer>();
        m_usaTemp   = 0;
        m_ukTemp    = 0;
        m_indiaTemp = 0;

    }

    @Override
    public void register(Observer newObserver) {

        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer ObserverName) {

        int index = observers.indexOf(ObserverName);
        observers.remove(index);
        System.out.println("removed Succesfully"+index);

    }

    @Override
    public void notifyall() {


        for (Observer obser: observers){
            obser.update(m_usaTemp,m_ukTemp,m_indiaTemp);

        }
        System.out.println(observers.size()+ "   sizee...");


    }

    public void upadteUsaTemp(double temp){
        this.m_usaTemp = temp;
        this.notifyall();

    }

    public void upadteUkTemp(double temp){
        this.m_ukTemp = temp;
        this.notifyall();

    }

    public void upadteIndiaTemp(double temp){
        this.m_indiaTemp = temp;
        this.notifyall();

    }
}
