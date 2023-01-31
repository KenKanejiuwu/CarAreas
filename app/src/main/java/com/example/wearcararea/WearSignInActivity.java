package com.example.wearcararea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wearcararea.databinding.ActivityWearSignInBinding;

public class WearSignInActivity extends Activity {

    private Button sign_in;
    private ActivityWearSignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityWearSignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button sign_in = findViewById(R.id.sign_in_btn);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WearSignInActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}