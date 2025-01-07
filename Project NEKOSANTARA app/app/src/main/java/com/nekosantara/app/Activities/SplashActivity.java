package com.nekosantara.app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.VideoView;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

import com.nekosantara.app.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Inisialisasi VideoView
        VideoView videoView = findViewById(R.id.videoView);

        // Menyediakan URI untuk file video dari raw folder
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splashscreenfinal);
        videoView.setVideoURI(videoUri);

        // Memutar video
        videoView.start();

        // Menunggu video selesai dan kemudian pindah ke Activity lain (misalnya MainActivity)
        videoView.setOnCompletionListener(mp -> {
            // Setelah video selesai, beralih ke MainActivity
            overridePendingTransition(android.R.anim.fade_out, android.R.anim.fade_in);
            startActivity(new Intent(SplashActivity.this, IntroActivity.class));
        });
    }
}
