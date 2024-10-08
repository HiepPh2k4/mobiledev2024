package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = "Weather Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.weather_activity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main, firstFragment).commit();
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "Pause");

    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "Resume");
    }
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "Start");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "Destroy");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "Stop");
    }
}