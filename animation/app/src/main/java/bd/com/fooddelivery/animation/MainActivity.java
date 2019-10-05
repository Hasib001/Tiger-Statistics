package bd.com.fooddelivery.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView myimageview = (ImageView)  findViewById(R.id.imageView5);
        myimageview.setImageResource(R.drawable.text);
    }
}
