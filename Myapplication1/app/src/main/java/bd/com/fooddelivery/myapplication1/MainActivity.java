package bd.com.fooddelivery.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.tamim);
        btn2=findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {

                                    public void onClick(View v) {
                                        Intent intent = new Intent(MainActivity.this, tamimActivity.class);
                                        Pair[] pairs = new Pair[1];
                                        pairs[0] = new Pair<View, String>(btn1, "imageTransition");
                                        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
                                        startActivity(intent, options.toBundle());
                                    }

                                });


        btn2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent =new Intent(MainActivity.this, sharedactivity.class);
                Pair[] pairs =new Pair[1];
                pairs[0]=new Pair<View , String>(btn2, "imageTransition");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent,options.toBundle());
            }

        });
    }
}
