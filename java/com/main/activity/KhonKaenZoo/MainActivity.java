package com.main.activity.KhonKaenZoo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import com.squareup.picasso.Picasso;
import AnimalList_bar.amphibians.Animal_amphibians_main_activity;
import AnimalList_bar.aquatic.Animal_aquatic_main_activity;
import AnimalList_bar.invertebrate.Animal_invertebrate_main_activity;
import AnimalList_bar.mammal.Animal_mammal_main_activity;
import AnimalList_bar.poultry.Animal_poutry_main_activity;
import AnimalList_bar.reptiles.Animal_retiles_main_activity;
import Main_menu_bar.MainPageActivity;
import Media_ebook_bar.MediaEbookMainAcitivity;
import Media_photo_bar.MediaPhotoMainAcitivity;
import Media_video_bar.MediaVideoMainAcitivity;
import RecommendedPlaces_bar.RecommendPlacesMainActivity;
import Ticket_menu_bar.TicketBookMainAcitivity;
import Timingshows_bar.TimingShowMainAcitivity;
import Zoo_infomation_bar.ZooInfomationMainAcitivity;
import developer_bar.DeveloperMainAcitivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
        GridView grid = findViewById(R.id.grid);
        grid.setOnItemClickListener(mOnItemClickListener);
        GridAdapter adapter = new GridAdapter();
        grid.setAdapter(adapter);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_action_bar_vector);
    }

    private final AdapterView.OnItemClickListener mOnItemClickListener
            = new AdapterView.OnItemClickListener() {

        /**
         * Called when an item in the {@link android.widget.GridView} is clicked. Here will launch
         * the {@link MainPageActivity}, using the Scene Transition animation functionality.
         */
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            HomePageItems item = (HomePageItems) adapterView.getItemAtPosition(position);

             if(position == 0) {
                 Intent intent = new Intent(MainActivity.this, MainPageActivity.class);
                 intent.putExtra(MainPageActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 MainPageActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 MainPageActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

            else if(position == 1) {
                Intent intent = new Intent(MainActivity.this, RecommendPlacesMainActivity.class);
                intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity.this,
                        new Pair<>(view.findViewById(R.id.imageview_item),
                                RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                        new Pair<>(view.findViewById(R.id.textview_name),
                                RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
            }

            else if(position == 2) {
                 Intent intent = new Intent(MainActivity.this, TimingShowMainAcitivity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 3) {
                 Intent intent = new Intent(MainActivity.this, TicketBookMainAcitivity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }


             else if(position == 4) {
                 Intent intent = new Intent(MainActivity.this, Animal_mammal_main_activity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 5) {
                 Intent intent = new Intent(MainActivity.this, Animal_retiles_main_activity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 6) {
                 Intent intent = new Intent(MainActivity.this, Animal_poutry_main_activity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 7) {
                 Intent intent = new Intent(MainActivity.this, Animal_aquatic_main_activity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 8) {
                 Intent intent = new Intent(MainActivity.this, Animal_amphibians_main_activity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 9) {
                 Intent intent = new Intent(MainActivity.this, Animal_invertebrate_main_activity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 10) {
                 Intent intent = new Intent(MainActivity.this, MediaPhotoMainAcitivity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 11) {
                 Intent intent = new Intent(MainActivity.this, MediaVideoMainAcitivity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 12) {
                 Intent intent = new Intent(MainActivity.this, MediaEbookMainAcitivity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 13) {
                 Intent intent = new Intent(MainActivity.this, ZooInfomationMainAcitivity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

             else if(position == 14) {
                 Intent intent = new Intent(MainActivity.this, DeveloperMainAcitivity.class);
                 intent.putExtra(RecommendPlacesMainActivity.EXTRA_PARAM_ID, item.getId());
                 ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                         MainActivity.this,
                         new Pair<>(view.findViewById(R.id.imageview_item),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_IMAGE),
                         new Pair<>(view.findViewById(R.id.textview_name),
                                 RecommendPlacesMainActivity.VIEW_NAME_HEADER_TITLE));
                 ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
             }

        }
    };
    private class GridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return HomePageItems.ITEMS.length;
        }

        @Override
        public HomePageItems getItem(int position) {
            return HomePageItems.ITEMS[position];
        }

        @Override
        public long getItemId(int position) {
            return getItem(position).getId();
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.grid_item, viewGroup, false);
            }

            final HomePageItems item = getItem(position);

            ImageView image = view.findViewById(R.id.imageview_item);
            Picasso.with(image.getContext()).load(item.getThumbnailUrl()).into(image);

            TextView name = view.findViewById(R.id.textview_name);
            name.setText(item.getName());

            return view;
        }
    }




}
