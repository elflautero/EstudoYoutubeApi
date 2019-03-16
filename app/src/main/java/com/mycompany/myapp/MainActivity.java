package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import com.google.android.youtube.player.*;
import com.google.android.youtube.player.YouTubePlayer.*;
import android.widget.*;
import android.webkit.*;

public class MainActivity 
	extends YouTubeBaseActivity 
	implements YouTubePlayer.OnInitializedListener
{


	private static final String API_KEY = "AIzaSyAQiSG812szll8y_BNCSi22rHVf3bplK3M";
	String youtubeID = "YR5ApYxkU-U";
	private YouTubePlayerView player;
	
	WebView wv;
	
	@Override
	public void onInitializationSuccess(
		YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain)
	{
		Toast.makeText(this,""+loadAgain, Toast.LENGTH_SHORT).show();
		if(loadAgain == true){
			player.cueVideo(youtubeID);
			Toast.makeText(this, "onInitializationSuccess", Toast.LENGTH_SHORT).show();
		}
		
	}

	@Override
	public void onInitializationFailure(
		YouTubePlayer.Provider provider, YouTubeInitializationResult youResult)
	{
		// toast para mostrar o erro na tela
		Toast.makeText(this, "onInitializationFailure", Toast.LENGTH_SHORT).show();
	}
	

	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		player = (YouTubePlayerView) findViewById(R.id.player_id);
		player.initialize(API_KEY, this);
		
		
		
		wv = (WebView)
			findViewById(R.id.webV_id);
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);

		String frameVideo = ("<iframe width=100% height='300' src='https://www.youtube.com/embed/YR5ApYxkU-U' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
		wv.loadData(frameVideo, "text/html", "utf-8");
		
    }
	
	
	
	
}
