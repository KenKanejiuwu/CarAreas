package com.example.wearcararea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.wearcararea.databinding.ActivityWearSignInBinding;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this,WearSignInActivity.class);
        startActivity(intent);
        finish();
    }
}
