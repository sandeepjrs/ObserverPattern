/**
 * Created by sandeep on 12/6/16.
 */
public class Controller {

    public static void main(String[] args){
        WeatherHub weather = new WeatherHub();

        WeatherObserver observer1 = new WeatherObserver(weather);
//        WeatherObserver observer2 = new WeatherObserver(weather);

        // just registering one observer
        weather.register(observer1);
        //weather.register(observer2);

//        weather.upadteIndiaTemp(22.3);
        //weather.upadteUkTemp(3.6);

        //weather.unregister(observer2);

        //weather.upadteIndiaTemp(33.3);




    }
}
