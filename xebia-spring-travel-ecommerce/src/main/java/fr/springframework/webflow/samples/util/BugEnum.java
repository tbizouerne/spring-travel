package fr.springframework.webflow.samples.util;

/**
 * Created by IntelliJ IDEA.
 * User: diego
 * Date: 3/19/12
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
public enum BugEnum {

    BOOKING_ACTION_CONTROLLER(421),
    JPA_LOGGER(666),
    DATABASE_CACHE_ASPECT(314),
    BOOKING_SERVICE_ENABLED_BOOKINGS(3615),
    BOOKING_SERVICE_ENABLED_HOTELS(3614),
    CACHE_FILTER(806),
    METHOD_LOGGER(1221),
    JPA_EAGER_EMULATION(33),
    BOOKING_NO_LIMIT(42),
    DS_SIZE(200),
    FAKE_EXCEPTIONS(21),
    UGLY_QUERIES(1974),
    PAY_ATTENION_TO_FILTERS(2223);

    private int code;

    BugEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
