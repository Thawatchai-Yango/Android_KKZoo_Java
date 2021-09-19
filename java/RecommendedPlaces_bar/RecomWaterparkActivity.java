package RecommendedPlaces_bar;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;
public class RecomWaterparkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recom_waterpark);
        setupHyperlink1();
        setupHyperlink2();
        setupHyperlink3();
        setupHyperlink4();
        setupHyperlink5();
        setupHyperlink6();
    }

    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.WtLink1);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.WtLink2);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink3() {
        TextView linkTextView = findViewById(R.id.WtLink3);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink4() {
        TextView linkTextView = findViewById(R.id.WtLink4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink5() {
        TextView linkTextView = findViewById(R.id.WtLink5);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink6() {
        TextView linkTextView = findViewById(R.id.WtLink6);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}