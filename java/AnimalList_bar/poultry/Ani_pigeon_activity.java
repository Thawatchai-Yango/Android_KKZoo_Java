package AnimalList_bar.poultry;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_pigeon_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_poultry_pigeon);
        WebView myWebView = (WebView) findViewById(R.id.web_pigeon);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=502&c_id=52");
    }
}