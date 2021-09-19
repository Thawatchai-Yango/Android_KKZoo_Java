package AnimalList_bar.amphibians;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_poisonfrog_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_amphibian_poisonfrog);
        WebView myWebView = (WebView) findViewById(R.id.web_poisonFrog);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=638&c_id=");
    }
}