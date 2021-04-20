package com.abarcenas.miedadcanina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.abarcenas.miedadcanina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.v("MainActivity", "Activity verbose");
        Log.d("MainActivity", "Activity debug");
        Log.i("MainActivity", "Activity info");
        Log.w("MainActivity", "Activity warn");
        Log.e("MainActivity", "Activity error");

        binding.button.setOnClickListener(v -> {
            String age = binding.ageEdit.getText().toString();
            if (!age.isEmpty()) {
                int ageInt = Integer.parseInt(age);

                int result = ageInt * 7;
                String resultString = getString(R.string.result_forma, result);
                binding.resultText.setText(resultString);
            } else {
                Toast.makeText(this, getString(R.string.you_have_to_insert_an_age), Toast.LENGTH_SHORT).show();


            }
        });
     }
    }
