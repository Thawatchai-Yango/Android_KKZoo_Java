package AnimalList_bar.mammal;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_elepha_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_mammal_elepha);
        WebView myWebView = (WebView) findViewById(R.id.web_eleph);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=169&c_id=");
    }
}