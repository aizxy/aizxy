package com.example.administrator.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView tvScore;
    private static MainActivity mainActivity=null;
    private TextView restart;
    private GameView gameView;


    public MainActivity(){
        mainActivity=this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore= (TextView) findViewById(R.id.tvScore);
        restart= (TextView) findViewById(R.id.btn_restart);
        gameView= (GameView) findViewById(R.id.gameView);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameView.startGame();
            }
        });
    }

    public static MainActivity getMainActivity(){
        return mainActivity;
    }

    private int score=0;
    public void clearScore(){
        score=0;
        showScore();
    }
    public void showScore(){
        tvScore.setText(score+"");
    }
    public void addScore(int s){
        score+=s;
        showScore();
    }
    public int getScore(){
        return score;
    }
}
