package AnimalList_bar.reptiles;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.transition.Transition;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import com.main.activity.KhonKaenZoo.HomePageItems;
import com.main.activity.KhonKaenZoo.R;
import com.squareup.picasso.Picasso;
import de.hdodenhof.circleimageview.CircleImageView;


public class Animal_retiles_main_activity extends AppCompatActivity  {
    public static final String EXTRA_PARAM_ID = "detail:_id";
    public static final String VIEW_NAME_HEADER_IMAGE = "detail:header:image";
    public static final String VIEW_NAME_HEADER_TITLE = "detail:header:title";
    private ImageView mHeaderImageView;
    private TextView mHeaderTitle;
    private HomePageItems mItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_reptile_main);
        mItem = HomePageItems.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        mHeaderImageView = findViewById(R.id.imageview_header);
        mHeaderTitle = findViewById(R.id.textview_title);
        ViewCompat.setTransitionName(mHeaderImageView, VIEW_NAME_HEADER_IMAGE);
        ViewCompat.setTransitionName(mHeaderTitle, VIEW_NAME_HEADER_TITLE);
        loadItem();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_reptiles_vector);

        CircleImageView bt1 = (CircleImageView) findViewById(R.id.treeViper_button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent( Animal_retiles_main_activity.this, Ani_treeViper_activity.class);
                startActivity(int1);
            }

        });


        CircleImageView bt2 = (CircleImageView) findViewById(R.id.crocodile_button);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent( Animal_retiles_main_activity.this, Ani_crocodile_activity.class);
                startActivity(int2);
            }

        });

        CircleImageView bt3 = (CircleImageView) findViewById(R.id.phyton_button);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent( Animal_retiles_main_activity.this, Ani_python_activity.class);
                startActivity(int3);
            }

        });

        CircleImageView bt4 = (CircleImageView) findViewById(R.id.tortois_button);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent( Animal_retiles_main_activity.this, Ani_tortois_activity.class);
                startActivity(int4);
            }

        });

        CircleImageView bt5 = (CircleImageView) findViewById(R.id.turtle_button);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5= new Intent( Animal_retiles_main_activity.this, Ani_turtle_activity.class);
                startActivity(int5);
            }

        });

        setupHyperlink1();

    }
        private void setupHyperlink1() {
        TextView linkTextView = findViewById(R.id.ani_reptilesLink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }


    private void loadItem() {
        mHeaderTitle.setText(getString(R.string.image_header, mItem.getName(), mItem.getAuthor()));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && addTransitionListener()) {
            loadThumbnail();
        } else {
            loadFullSizeImage();
        }
    }

    private void loadThumbnail() {
        Picasso.with(mHeaderImageView.getContext())
                .load(mItem.getThumbnailUrl())
                .noFade()
                .into(mHeaderImageView);
    }


    private void loadFullSizeImage() {
        Picasso.with(mHeaderImageView.getContext())
                .load(mItem.getPhotoUrl())
                .noFade()
                .noPlaceholder()
                .into(mHeaderImageView);
    }

    @RequiresApi(21)
    private boolean addTransitionListener() {
        final Transition transition = getWindow().getSharedElementEnterTransition();

        if (transition != null) {

            transition.addListener(new Transition.TransitionListener() {
                @Override
                public void onTransitionEnd(Transition transition) {
                    loadFullSizeImage();
                    transition.removeListener(this);
                }

                @Override
                public void onTransitionStart(Transition transition) {
                }

                @Override
                public void onTransitionCancel(Transition transition) {
                    transition.removeListener(this);
                }

                @Override
                public void onTransitionPause(Transition transition) {
                }

                @Override
                public void onTransitionResume(Transition transition) {
                }
            });
            return true;
        }

        return false;
    }

}

