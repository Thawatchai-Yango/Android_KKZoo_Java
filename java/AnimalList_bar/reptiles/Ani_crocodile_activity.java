package AnimalList_bar.reptiles;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_crocodile_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_reptiles_crocodile);
        WebView myWebView = (WebView) findViewById(R.id.web_crocodile);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=589&c_id=51");
    }
}