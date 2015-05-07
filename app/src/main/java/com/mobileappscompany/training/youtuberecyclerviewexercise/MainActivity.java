package com.mobileappscompany.training.youtuberecyclerviewexercise;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.mobileappscompany.training.youtuberecyclerviewexercise.database.DaoMaster;
import com.mobileappscompany.training.youtuberecyclerviewexercise.database.DaoSession;
import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Thumbnail;
import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Video;
import com.mobileappscompany.training.youtuberecyclerviewexercise.web.BitmapLruCache;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = "MainActivity";


    public DaoSession daoSession;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Video> videos;
    private VideoListAdapter videoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupRecylerView();

        setupDatabase();
    }

    private void setupRecylerView() {
        videos = new ArrayList<Video>();
        videoListAdapter = new VideoListAdapter(
                            new ImageLoader(Volley.newRequestQueue(this), new BitmapLruCache()),
                            videos);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(videoListAdapter);

        Thumbnail thumbnail = new Thumbnail.ThumbnailBuilder()
                .sqDefault("https://i.ytimg.com/vi/UKY3scPIMd8/default.jpg")
                .build();
        Video video1 = new Video.VideoBuilder()
                .id(0L)
                .title("Video1")
                .description("description")
                .category("category")
                .thumbnail(thumbnail)
                .build();

        Log.d(TAG,"Adding a video to the collection: ");
        Log.d(TAG,"Size of videos before add: " + videos.size());
        videos.add(video1);
        Log.d(TAG,"Size of videos after add: " + videos.size());
        videoListAdapter.notifyDataSetChanged();
    }

    private void setupDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"videos-db",null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
