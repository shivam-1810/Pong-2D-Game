package com.example.pong2d;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PongActivity extends AppCompatActivity {

    private GameThread mGameThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pong);


        final PongTable table = (PongTable) findViewById(R.id.pongTable);
        table.setScoreOpponent((TextView) findViewById(R.id.tvScoreOpponent));
        table.setScorePlayer((TextView) findViewById(R.id.tvScorePlayer));
        table.setStatus((TextView) findViewById(R.id.tvStatus));


        mGameThread = table.getGame();


    }
}