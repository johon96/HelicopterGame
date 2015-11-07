package com.example.johnathanvg.helicoptergame;

/**
 * Created by Johnathanvg on 11/6/2015.
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Explosion {
    private int x;
    private int y;
    private int height;
    private Animation animation = new Animation();

    public Explosion(Bitmap res[], int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.height = h;
        animation.setFrames(res);
        animation.setDelay(1);



    }
    public void draw(Canvas canvas)
    {
        if(!animation.playedOnce())
        {
            canvas.drawBitmap(animation.getImage(),x,y,null);
        }

    }
    public void update()
    {
        if(!animation.playedOnce())
        {
            animation.update();
        }
    }
    public int getHeight(){return height;}
}