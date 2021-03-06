package fr.springframework.webflow.samples.booking;

import javax.persistence.PostLoad;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * User: blep
 * Date: 27/09/13
 * Time: 08:50
 */

public class HotelListener {

    public static AtomicBoolean bugEnabled = new AtomicBoolean(true);

    public static ThreadLocal<Boolean> override = new ThreadLocal<Boolean>();

    @PostLoad
    public void onPostLoad(Hotel hotel){
//        System.out.println("HotelListener.onPostLoad");
            if(bugEnabled.get()) {
            if(override.get() == null || !override.get()){
                hotel.getBookings().size();
//                System.out.println("hotel.getBookings().size() = " + hotel.getBookings().size());
            }
        }
    }
}
