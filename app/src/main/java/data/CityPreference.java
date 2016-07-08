package data;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Rahul Kushwaha on 30-May-16.
 */
public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    //If the user has not chosen a city, return default

    public String getCity() {
        return prefs.getString("city", "Mumbai,IN");
    }

    public void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }
}
