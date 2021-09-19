package AnimalList_bar.mammal;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_whiteLion_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_mammal_whitelion);
        WebView myWebView = (WebView) findViewById(R.id.web_whiteLion);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=360&c_id=");

    }
}