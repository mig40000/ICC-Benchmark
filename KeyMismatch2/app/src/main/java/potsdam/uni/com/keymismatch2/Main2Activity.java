package potsdam.uni.com.keymismatch2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String imei = i.getStringExtra("imei");

        Intent newIntent = new Intent(this, Main3Activity.class);

        newIntent.putExtra("imei", imei);
        newIntent.putExtra("greetings", "hello world");

        startActivity(newIntent);
    }
}
