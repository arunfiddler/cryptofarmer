package tk.arunfiddler.cryptofarmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class registeractivity extends AppCompatActivity {
      private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);
        tv  =(TextView) findViewById(R.id.signup);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(registeractivity.this,signinactivity.class);
                startActivity(signup);
            }
        });
    }
}
