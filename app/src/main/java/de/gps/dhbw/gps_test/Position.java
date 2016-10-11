package de.gps.dhbw.gps_test;

/**
 * Created by Jan-Laptop on 11.10.2016.
 */

public class Position {
    double lon;
    double lat;

    String getString(){
        StringBuilder sb = new StringBuilder();
        sb.append(lon);
        sb.append(" ");
        sb.append(lat);
        return sb.toString();
    }
}
