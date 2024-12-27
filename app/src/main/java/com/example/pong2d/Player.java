package com.example.pong2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import androidx.annotation.NonNull;

public class Player {
    private int racketWidth;
    private int racketHeight;
    public int score;
    private Paint paint;
    public RectF bounds;

    public Player(Paint paint, int racketHeight, int racketWidth) {
        this.paint = paint;
        this.racketHeight = racketHeight;
        this.racketWidth = racketWidth;
        bounds = new RectF(0,0,racketWidth,racketHeight);
    }

    public void draw(Canvas canvas) {
        canvas.drawRoundRect(bounds, 5, 5, paint);
    }

    public int getRacketWidth() {
        return racketWidth;
    }



    public int getRacketHeight() {
        return racketHeight;
    }

    @NonNull
    @Override
    public String toString() {
        return "Player{" +
                "score=" + score +
                ", racketHeight=" + racketHeight +
                ", racketWidth=" + racketWidth +
                '}';
    }
}
