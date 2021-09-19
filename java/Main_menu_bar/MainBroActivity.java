package Main_menu_bar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.main.activity.KhonKaenZoo.R;

public class MainBroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage_brosure);
        setupHyperlink1();
        setupHyperlink2();
        setupHyperlink3();
        setupHyperlink4();
        setupHyperlink5();
        setupHyperlink6();
    }

    private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.BroLink1);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink2() {
        TextView linkTextView = findViewById(R.id.BroLink2);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink3() {
        TextView linkTextView = findViewById(R.id.BroLink3);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink4() {
        TextView linkTextView = findViewById(R.id.BroLink4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink5() {
        TextView linkTextView = findViewById(R.id.BroLink5);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupHyperlink6() {
        TextView linkTextView = findViewById(R.id.BroLink6);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}