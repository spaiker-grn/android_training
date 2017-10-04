package spaiker_grn.github.com.android_training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final TextView mTextView = (TextView) findViewById(R.id.textView);

    @Override
    public void onClick(final View v) {

        mTextView.setText("Hello Epam");

    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
        //add comment

    }
}
