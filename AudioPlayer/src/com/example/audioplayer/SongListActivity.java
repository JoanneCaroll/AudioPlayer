package com.example.audioplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SongListActivity extends Activity{
	public static final String TAG ="SongListActivity";
	Button song1, song2;
	boolean songclicked;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.song_list);
		Log.d(TAG, "OnCreate()");
		song1 = (Button)findViewById(R.id.song1);
		song1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SongListActivity.this, AudioPlayerActivity.class);
				i.putExtra(AudioPlayerActivity.EXTRA_SONG1, songclicked);
				startActivity(i);
				finish();
			}
		});
		
		song2 = (Button)findViewById(R.id.song2);
		song2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SongListActivity.this, AudioPlayerActivity.class);
				i.putExtra(AudioPlayerActivity.EXTRA_SONG2, songclicked);
				startActivity(i);
				finish();
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
