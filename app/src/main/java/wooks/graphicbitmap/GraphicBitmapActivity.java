package wooks.graphicbitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GraphicBitmapActivity extends AppCompatActivity {

    public GraphicBitmapActivity() {
        super();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        Matrix m = new Matrix();
        m.preScale(1, -1);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.house);
        Bitmap mb = Bitmap.createBitmap(b, 0, 0, b.getWidth(), b.getHeight(), m, false);
        Bitmap sb = Bitmap.createScaledBitmap(b, 200, 200, false);
        canvas.drawBitmap(mb, 0, 0, null);
        canvas.drawBitmap(sb, 100, 100, null);
    }
}

