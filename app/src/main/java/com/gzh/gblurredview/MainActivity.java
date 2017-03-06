package com.gzh.gblurredview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

import com.gzh.blurredibrary.BlurredView;


public class MainActivity extends AppCompatActivity {

    private SeekBar mSeekBar;
    private TextView mTextView;
    private BlurredView mBlurredView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekBar = (SeekBar) findViewById(R.id.sbar);
        mTextView = (TextView) findViewById(R.id.tv_seek);
        mBlurredView = (BlurredView) findViewById(R.id.bv);
        //设置模糊图片和相对应的模式
        mBlurredView.setBlurredImg(getResources().getDrawable(R.drawable.ic_test));
        //
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mTextView.setText("拖动控制模糊度：" + progress + "%");
                //设置模糊成都（0-100）
                mBlurredView.setBlurredLevel(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
