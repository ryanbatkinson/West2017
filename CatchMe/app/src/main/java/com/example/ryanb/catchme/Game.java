package com.example.ryanb.catchme;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

public class Game extends Activity
{

    ImageView myView;
    int screenW, screenH;

    // This is the entry point to our game
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Do all our drawing in a separate method
        Display display = getWindowManager().getDefaultDisplay();
        screenW = display.getWidth();
        screenH = display.getHeight();
        draw();

        // Make ourView ImageView object the view for the Activity
        setContentView(myView);

    }

    public void draw()
    {
        Bitmap b = Bitmap.createBitmap(screenW,screenH,Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        myView = new ImageView(this);
        myView.setImageBitmap(b);
        Paint paint = new Paint();
        canvas.drawColor(Color.argb(255, 255, 255, 255));
        paint.setColor(Color.argb(255,  26, 128, 182));
        canvas.drawText("WELCOME TO SCHOOL FUCKERS!", 100, 100, paint);
        canvas.drawCircle(400, 400, 125, paint);
    }
}