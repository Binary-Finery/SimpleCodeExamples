package spencerstudios.com.simplecodeexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final int DEFAULT_INT_VALUE = 0;

        Intent intent = getIntent();
        String str = intent.getStringExtra("MY_STRING");
        int i = intent.getIntExtra("MY_INT", DEFAULT_INT_VALUE);

        TextView textView = (TextView)findViewById(R.id.textview);

        textView.setText(str + "\n" + i);
    }
}
