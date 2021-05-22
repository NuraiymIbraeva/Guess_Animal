package com.nurayim.guess_animal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView title;
    ImageView imageView;
    boolean isCat, isDog, isRabbit;
    Button cat,dog,rabbit;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initButtons();
    }

    private void initButtons() {
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCat){
                    title.setText("Это кошка");
                    Toast.makeText(MainActivity.this,"Правильно это кошка",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this,"Неправильно",Toast.LENGTH_SHORT).show();
                }
            }
        });
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDog){
                    title.setText("Это собака");
                    Toast.makeText(MainActivity.this,"Правильно это собака",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this,"Неправильно",Toast.LENGTH_SHORT).show();
                }
            }
        });
        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title.setText("Это заяц");
                Toast.makeText(MainActivity.this,"Правильно это заяц",Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void initViews() {
        title = findViewById(R.id.title_of_picture);
        imageView = findViewById(R.id.im_different_picture);
        cat = findViewById(R.id.cat);
        dog= findViewById(R.id.dog);
        rabbit=findViewById(R.id.rabbit);




    }


    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.number_of_btn:
                imageView.setImageResource(R.drawable.cat);

                isCat = true;
                isDog = false;
                isRabbit =false;
                break;

            case R.id.number_of_btn2:
                imageView.setImageResource(R.drawable.rabbit);

                isRabbit=true;
                isCat=false;
                isDog=false;
                break;
            case R.id.number_of_btn3:
                imageView.setImageResource(R.drawable.dog);

                isDog=true;
                isRabbit=false;
                isCat=false;
                break;

        }
    }
}