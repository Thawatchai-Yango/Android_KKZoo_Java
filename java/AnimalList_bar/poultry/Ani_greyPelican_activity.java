package AnimalList_bar.poultry;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_greyPelican_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_poultry_grey_pelican);
        WebView myWebView = (WebView) findViewById(R.id.web_greyPelican);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=154&c_id=52");
    }
}