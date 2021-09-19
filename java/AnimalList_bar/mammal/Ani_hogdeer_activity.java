package AnimalList_bar.mammal;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_hogdeer_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_mammal_hog_deer);
        WebView myWebView = (WebView) findViewById(R.id.web_hogdeer);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=164&c_id=50");
    }
}