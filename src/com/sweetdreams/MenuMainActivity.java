package com.sweetdreams;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MenuMainActivity extends Activity {
	
	 public final static String EXTRA_MESSAGE = "com.sweetdreams.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
//		Intent intent = new Intent(this, DisplayMessageActivity.class);
//		String message = "Resumed!";
//		intent.putExtra(EXTRA_MESSAGE, message);
//		startActivity(intent);
	}
	
	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}

}
