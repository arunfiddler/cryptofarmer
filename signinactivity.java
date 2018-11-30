package tk.arunfiddler.cryptofarmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;



public class signinactivity extends AppCompatActivity {
    TextView signin;
    EditText referralid;
    EditText phone;
    EditText email;
    EditText username;
    EditText password;
    Button register;
    String url = "https://arundemo1.herokuapp.com/";
//    final RequestQueue queue = Volley.newRequestQueue(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinactivity);
        signin = (TextView) findViewById(R.id.login);
        referralid = (EditText) findViewById(R.id.referralid);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        username = (EditText) findViewById(R.id.username);
        register = (Button) findViewById(R.id.register);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin = new Intent(signinactivity.this, registeractivity.class);
                startActivity(signin);
            }
        });
//        String refid = referralid.getText().toString();
//        String ph = phone.getText().toString();
//        String mail = email.getText().toString();
//        String uname = username.getText().toString();
//        String pass = password.getText().toString();
//            JSONObject json = new JSONObject();
//            try{
//                json.put("name",uname);
//                json.put("phone",ph);
//                json.put("email",mail);
//                json.put("referal",refid);
//                json.put("password",pass);
//
//            }catch (JSONException e)
//            {
//                e.printStackTrace();
//            }
//            final String JSONString = json.toString();
//
//    register.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        SendDatatoServer(JSONString);
//    }
//});
//
//}
//    private void SendDatatoServer(final String json) {
//
//    }


    }

}