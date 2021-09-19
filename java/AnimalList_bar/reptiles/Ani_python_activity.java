package AnimalList_bar.reptiles;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_python_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_reptiles_phyton);
        WebView myWebView = (WebView) findViewById(R.id.web_python);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=202&c_id=51");
    }
}