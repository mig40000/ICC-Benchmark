package potsdam.uni.com.iac1_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();

        String imei = i.getStringExtra("imei");

       Intent newIntent = new Intent("custom_action_2");

       newIntent.putExtra("greetings", "hello world");
       newIntent.putExtra("uid", imei);

       startActivity(newIntent);
    }
}
