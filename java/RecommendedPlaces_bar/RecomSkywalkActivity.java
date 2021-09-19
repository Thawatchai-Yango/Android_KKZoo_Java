package RecommendedPlaces_bar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.main.activity.KhonKaenZoo.R;

public class RecomSkywalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recom_skywalk);
        setupHyperlink1();
        setupHyperlink2();
        setupHyperlink3();
        setupHyperlink4();
        setupHyperlink5();
        setupHyperlink6();
    }

    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.SkyLink1);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.SkyLink2);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink3() {
        TextView linkTextView = findViewById(R.id.SkyLink3);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink4() {
        TextView linkTextView = findViewById(R.id.SkyLink4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink5() {
        TextView linkTextView = findViewById(R.id.SkyLink5);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink6() {
        TextView linkTextView = findViewById(R.id.SkyLink6);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}