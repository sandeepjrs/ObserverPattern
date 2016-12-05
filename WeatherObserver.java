/**
 * Created by sandeep on 12/5/16.
 */
public class WeatherObserver implements Observer {

//    private WeatherHub weatherHub;
    private int uniqueIdTracker;
    private static int idCounter = 0;

    private   double m_usaTemp;
    private  double m_ukTemp;
    private  double m_indiaTemp;

    private  Subject mySubject;



    /** the input as a weather hub because Observer object need
     * to set of what subject he want to observe
     */

    WeatherObserver(Subject sub){
        this.mySubject = sub;
        sub.register(this);
        uniqueIdTracker = ++idCounter;
        System.out.println("the new observer has been added unique Id : " +  this.uniqueIdTracker);

    }


    @Override
    public void update(double usa_Temp, double uk_temp, double india_temp) {
        this.m_usaTemp = usa_Temp;
        this.m_ukTemp = uk_temp;
        this.m_indiaTemp = india_temp;
        printMe();
    }



    public void printMe(){
        System.out.println("the latest weather report Observer ID :"+uniqueIdTracker+ "\n" +
                "USA : "+this.m_usaTemp +"\n" +
                "UK : "+ this.m_ukTemp + "\n" +
                "INDIA : " + this.m_indiaTemp);
    }
}
