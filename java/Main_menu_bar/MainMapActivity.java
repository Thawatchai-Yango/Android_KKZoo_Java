package Main_menu_bar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.main.activity.KhonKaenZoo.R;

public class MainMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage_map);
        setupHyperlink();
        setupHyperlink6();
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.MapLink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink6() {
        TextView linkTextView = findViewById(R.id.web_zooInfoLink6);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}