package AnimalList_bar.poultry;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_flamingo_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_poultry_flamingo);
        WebView myWebView = (WebView) findViewById(R.id.web_flamingo);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=270&c_id=52");
    }
}