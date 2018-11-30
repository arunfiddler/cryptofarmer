package tk.arunfiddler.cryptofarmer;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends Activity {
    private static int SPLASH_TIMER = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(splashscreen.this, WelcomeActivity.class);
                startActivity(splash);
                finish();
            }
        },SPLASH_TIMER);


    }
}
