package com.example.imageproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random rand = new Random();
    private Button button;
    private ImageView img;
    private int[] Id = {0,0,0};
    private int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        img = findViewById(R.id.imageView);

        Id[0] = R.drawable.endworld;
        Id[1] = R.drawable.endworld2;
        Id[2] = R.drawable.endworld3;
    }

    public void go(View view) {
        num = rand.nextInt(3);
        String stra = (num+1)+" ";
        button.setText(" "+stra);
        img.setImageResource(Id[num]);
    }
}