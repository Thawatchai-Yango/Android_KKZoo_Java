package AnimalList_bar.reptiles;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.main.activity.KhonKaenZoo.R;

public class Ani_treeViper_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_reptiles_tree_viper);
        WebView myWebView = (WebView) findViewById(R.id.web_treeViper);
        myWebView.loadUrl("http://www.khonkaen.zoothailand.org/animal_view.php?detail_id=610&c_id=51");
    }
}