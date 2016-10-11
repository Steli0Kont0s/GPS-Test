package de.gps.dhbw.gps_test;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jan-Laptop on 11.10.2016.
 */

public class MyLocationListener implements LocationListener {

    TextView text;

    public MyLocationListener(TextView text){
        this.text = text;
    }

    @Override
    public void onLocationChanged(Location location){
        MainActivity.myPosition.lat = location.getLatitude();
        MainActivity.myPosition.lon = location.getLongitude();

        this.text.setText(MainActivity.myPosition.getString());
    }

    @Override
    public void onProviderDisabled(String provider){
        this.text.setText("Provider Disabled");
    }

    @Override
    public void onProviderEnabled(String provider){

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }


}
