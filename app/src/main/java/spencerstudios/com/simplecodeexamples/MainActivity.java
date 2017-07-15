package spencerstudios.com.simplecodeexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickEvent(View v) {

        int id = v.getId();

        if (id == R.id.button_next_activity) {

            String str = "Yo bro, I'm activity surfing";
            int i = 100;

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("MY_STRING", str);
            intent.putExtra("MY_INT", i);
            startActivity(intent);
        }

        if (id == R.id.button_display_snackbar) {
            Snackbar.make(v, "Hi, I'm a Snackbar", Snackbar.LENGTH_SHORT).show();
        }
    }
}
