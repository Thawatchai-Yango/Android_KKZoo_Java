package RecommendedPlaces_bar;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class RecomDeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recom_deer);
        setupHyperlink1();
        setupHyperlink2();
        setupHyperlink3();
        setupHyperlink4();
    }

    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.DeerLink1);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.DeerLink2);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink3() {
        TextView linkTextView = findViewById(R.id.DeerLink3);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink4() {
        TextView linkTextView = findViewById(R.id.DeerLink4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}