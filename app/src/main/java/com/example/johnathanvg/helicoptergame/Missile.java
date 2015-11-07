package com.example.johnathanvg.helicoptergame;

/**
 * Created by Johnathanvg on 11/6/2015.
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Random;

public class Missile extends GameObject{
    private int score;
    private final int MAXSPEED = 40;
    private int speed;
    private Random rand = new Random();
    private Animation animation = new Animation();
    private Bitmap spritesheet;

    public Missile(Bitmap res [], int x, int y, int w, int h, int s)
    {
        super.x = x;
        super.y = y;
        width = w;
        height = h;
        score = s;

        speed = 7 + (int) (rand.nextDouble()*score/30);

        //cap speed
        if(speed>MAXSPEED)
            speed = MAXSPEED;

        animation.setFrames(res);
        animation.setDelay(100-speed);

    }
    public void update()
    {
        x-=speed;
        animation.update();
    }
    public void draw(Canvas canvas)
    {
        try{
            canvas.drawBitmap(animation.getImage(),x,y,null);
        }catch(Exception e){}
    }

    @Override
    public int getWidth()
    {
        //More realistic collision detection
        return width-10;
    }

}
