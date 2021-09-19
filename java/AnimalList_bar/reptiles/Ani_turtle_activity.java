package AnimalList_bar.reptiles;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_turtle_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_reptiles_turtle);
        WebView myWebView = (WebView) findViewById(R.id.web_turtle);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=550&c_id=51");
    }
}