package edu.ucuccs.bs_itcalculator;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
TabHost tabHost = getTabHost();

		// Tab for calc
		TabSpec calcspec = tabHost.newTabSpec("Converter");
		calcspec.setIndicator("Converter", getResources().getDrawable(R.drawable.bgp));
		Intent calcIntent = new Intent(this, calc.class);
		calcspec.setContent(calcIntent);
		
        // Tab for help
        TabSpec helpspec = tabHost.newTabSpec("Help");
        helpspec.setIndicator("Help", getResources().getDrawable(R.drawable.help));
        Intent helpIntent = new Intent(this, help.class);
        helpspec.setContent(helpIntent);
     // Tab for about
        
        TabSpec aboutspec = tabHost.newTabSpec("About");
        aboutspec.setIndicator("About", getResources().getDrawable(R.drawable.help));
        Intent aboutIntent = new Intent(this, about.class);
        aboutspec.setContent(aboutIntent);
        
        tabHost.addTab(calcspec);
        tabHost.addTab(helpspec);
        tabHost.addTab(aboutspec);
        
	}

	
}
