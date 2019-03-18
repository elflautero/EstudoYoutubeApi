package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import com.google.android.youtube.player.*;
import com.google.android.youtube.player.YouTubePlayer.*;
import android.widget.*;
import android.webkit.*;
import android.view.*;

public class MainActivity 
	extends YouTubeBaseActivity 
	implements YouTubePlayer.OnInitializedListener
{


	private static final String API_KEY = "";
	String youtubeID = "5xzWr1iYE2k";
	private YouTubePlayerView player;
	
	WebView wv;
	
	@Override
	public void onInitializationSuccess(
		YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain)
	{
		player.cueVideo(youtubeID);
	}

	@Override
	public void onInitializationFailure(
		YouTubePlayer.Provider provider, YouTubeInitializationResult youResult)
	{
		// toast para mostrar o erro na tela
		Toast.makeText(this, "onInitializatioanFailure", Toast.LENGTH_SHORT).show();
	}
	

	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		player = (YouTubePlayerView) findViewById(R.id.player_id);
		player.initialize(API_KEY, this);
		
		
		/*
		wv = (WebView)
			findViewById(R.id.webV_id);
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);

		String frameVideo = ("<iframe width=100% height='300' src='https://www.youtube.com/embed/"+youtubeID+"' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
		wv.loadData(frameVideo, "text/html", "utf-8");*/
		
		
		
    }
	
	
	public void onClickBegin (View view){
		
	
	}
}
