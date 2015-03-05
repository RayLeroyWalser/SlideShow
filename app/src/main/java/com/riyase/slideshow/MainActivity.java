package com.riyase.slideshow;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private static final int images[]= {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5
    };
    
    
    SlideShow slideShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideShow=(SlideShow)findViewById(R.id.slideShow);
        slideShow.setImageArray(images);
        slideShow.start(2000,0);
    }

}
