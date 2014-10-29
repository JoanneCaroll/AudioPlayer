package com.example.audioplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class AudioPlayerActivity extends Activity {
	public static final String TAG ="AudioPlayerActivity";
	public static final String EXTRA_SONG1="com.example.audioplayer.EXTRA_SONG1";
	public static final String EXTRA_SONG2="com.example.audioplayer.EXTRA_SONG2";
	TextView songTitle;
	Button playButton, pauseButton, stopButton, chooseButton;
    
	private void setAnswerShownResult(boolean isAnswerShown) {
        Intent data = new Intent();
        data.putExtra(EXTRA_SONG1, isAnswerShown);
        setResult(RESULT_OK, data);
    }
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player);
        Log.d(TAG, "OnCreate()");
        songTitle=(TextView)findViewById(R.id.songTitle);
        playButton=(Button)findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

			}
		});
        pauseButton=(Button)findViewById(R.id.pauseButton);
        stopButton=(Button)findViewById(R.id.stopButton);
        chooseButton=(Button)findViewById(R.id.chooseSong);
        chooseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(AudioPlayerActivity.this, SongListActivity.class);
				startActivity(i);
			}
		});
        
        
    }
    @Override
    public void onStart(){
    	super.onStart();
    	Log.d(TAG, "OnStart()");
    }
    @Override
    public void onPause(){
    	super.onPause();
    	Log.d(TAG, "OnPause()");
    }
    @Override
    public void onStop(){
    	super.onStop();
    	Log.d(TAG, "OnStop()");
    }
    @Override
    public void onDestroy(){
    	super.onDestroy();
    	Log.d(TAG, "OnDestroy()");
    }
    @Override
    public void onResume(){
		super.onResume();
		Log.d(TAG, "OnResume()");
    }

}
