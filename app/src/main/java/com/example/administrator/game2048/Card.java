package com.example.administrator.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/27 0027.
 */
public class Card extends FrameLayout {
    private TextView label;
    public Card(Context context) {
        super(context);
        label=new TextView(getContext());
        label.setTextSize(32);
        label.setBackgroundColor(0x33ffffff);
        label.setGravity(Gravity.CENTER);

        LayoutParams lp=new LayoutParams(-1,-1);
        lp.setMargins(10,10,0,0);
        addView(label,lp);
        setNum(0);
    }
    private int num=8;
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
        if(num<=0){
            label.setText("");
            label.setBackgroundColor(0x33ffffff);
        }else{
            if(num<=32) {
                if (num == 2) {
                    label.setBackgroundColor(0xffffff00);
                }
                if (num == 4) {
                    label.setBackgroundColor(0x3300ffff);
                }
                if (num == 8) {
                    label.setBackgroundColor(0x33ff00ff);
                }
                if (num == 16) {
                    label.setBackgroundColor(0xffe3085d);
                }
                if (num == 32) {
                    label.setBackgroundColor(0xff6a62e5);
                }
            }else{
                label.setBackgroundColor(0x776a62e5);
            }
            label.setText(num+"");
        }
    }

    public boolean equals(Card obj) {
        return getNum()==obj.getNum();
    }
}
