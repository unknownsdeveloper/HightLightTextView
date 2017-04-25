package ankit.developer.unknowns.hightlighttextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.athkalia.emphasis.EmphasisTextView;

public class MainActivity extends AppCompatActivity {
    EmphasisTextView emphasisTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emphasisTextView = (EmphasisTextView)findViewById(R.id.txtEmphasis);

        emphasisTextView.setText("This is highlight text");

        emphasisTextView.setTextToHighlight("This is highlight");

        emphasisTextView.setTextHighlightColor("#FF3393B4");

        emphasisTextView.setCaseInsensitive(true);

        emphasisTextView.highlight();
    }
}
