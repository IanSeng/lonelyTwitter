package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        textView = (TextView)findViewById(R.id.textView);
        String tempListView = getIntent().getStringExtra("ListViewclickValue");
        textView.setText(tempListView);
    }
}
