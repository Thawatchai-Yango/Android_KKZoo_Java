package AnimalList_bar.amphibians;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_sutinamtoad_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_amphibian_surinamtoad);
        WebView myWebView = (WebView) findViewById(R.id.web_surinamToad);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=631&c_id=");
    }
}