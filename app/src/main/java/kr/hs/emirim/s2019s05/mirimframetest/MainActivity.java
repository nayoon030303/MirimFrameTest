package kr.hs.emirim.s2019s05.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1,layout2, layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.img1);
        layout2 = findViewById(R.id.img2);
        layout3 = findViewById(R.id.img3);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(btnListener);
        btn2.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            layout1.setVisibility(View.INVISIBLE);
            layout2.setVisibility(View.INVISIBLE);
            layout3.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn1:
                    layout1.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn2:
                    layout2.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn3:
                    layout3.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}