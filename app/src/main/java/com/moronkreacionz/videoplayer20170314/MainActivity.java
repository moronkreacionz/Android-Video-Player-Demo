package com.moronkreacionz.videoplayer20170314;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView myFirstVideoView = (VideoView) findViewById(R.id.firstVideoView);
        myFirstVideoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.videoplayback);

        MediaController mc = new MediaController(this);
        mc.setAnchorView(myFirstVideoView);

        myFirstVideoView.setMediaController(mc);
        myFirstVideoView.start();

    }
}
