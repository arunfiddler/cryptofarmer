package tk.arunfiddler.cryptofarmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signupscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupscreen);
        init();
    }
    private void init(){
        Button signup = (Button)findViewById(R.id.signup);
        Button signin = (Button)findViewById(R.id.signin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Change to Signup Activity instead of MAin Activity
                Intent signupintent = new Intent(signupscreen.this,signinactivity.class);
                startActivity(signupintent);

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Change to the Login screen instead of MainActivity
                Intent signinIntent = new Intent(signupscreen.this, registeractivity.class);
                startActivity(signinIntent);

            }
        });
    }
}
