package com.base.k4mediaassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity{

    ImageView game1,game2,game3,game4,game5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        game1 = findViewById(R.id.game1);
        game2 = findViewById(R.id.game2);
        game3 = findViewById(R.id.game3);
        game4 = findViewById(R.id.game4);
        game5 = findViewById(R.id.game5);


        ImageView backimage = findViewById(R.id.backimage);
        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(  new Intent(getApplicationContext(), INFOAcitivty.class));
            }
        });


        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("url", "https://ivigames.com/game/super-mario-run-2");
                startActivity(intent);

            }
        });

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("url", "https://corpsepile.itch.io/make-sure-its-closed");
                startActivity(intent);
            }
        });

        game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("url", "https://jani-nykanen.itch.io/one-last-adventure");
                startActivity(intent);
            }
        });


        game4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("url", "https://escada-games.itch.io/pigeon-ascent");
                startActivity(intent);

            }
        });

        game5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GameActivity.this, MainActivity.class);
                intent.putExtra("url", "https://flappybird.io/");
                startActivity(intent);
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//
//        if(v.getId() == R.id.game1){
//            Intent intent = new Intent(GameActivity.this, MainActivity.class);
//            intent.putExtra("url", "https://ivigames.com/game/super-mario-run-2");
//            startActivity(intent);
//        }
//
//        if(v.getId() == R.id.game2){
//            Intent intent = new Intent(GameActivity.this, MainActivity.class);
//            intent.putExtra("url", "https://example.com/game1");
//            startActivity(intent);
//        }
//
//        if(v.getId() == R.id.game3){
//            Intent intent = new Intent(GameActivity.this, MainActivity.class);
//            intent.putExtra("url", "https://example.com/game1");
//            startActivity(intent);
//        }
//
//        if(v.getId() == R.id.game4){
//            Intent intent = new Intent(GameActivity.this, MainActivity.class);
//            intent.putExtra("url", "https://example.com/game1");
//            startActivity(intent);
//        }
//
//        if(v.getId() == R.id.game5){
//            Intent intent = new Intent(GameActivity.this, MainActivity.class);
//            intent.putExtra("url", "https://example.com/game1");
//            startActivity(intent);
//        }
//
//    }
}