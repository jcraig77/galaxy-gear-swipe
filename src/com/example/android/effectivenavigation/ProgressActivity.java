package com.example.android.effectivenavigation;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

public class ProgressActivity extends Activity {
	private final static Double DAILY_TARGET = 8.00;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress);
		
	}

}
