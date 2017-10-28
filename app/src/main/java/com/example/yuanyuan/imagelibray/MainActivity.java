package com.example.yuanyuan.imagelibray;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.yuanyuan.imagelibray.utils.FileUtils;
import com.example.yuanyuan.imagelibray.utils.LogUtils;
import com.yuyh.library.imgsel.ImageLoader;
import com.yuyh.library.imgsel.ImgSelActivity;
import com.yuyh.library.imgsel.ImgSelConfig;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageLoader loader = new ImageLoader() {
        @Override
        public void displayImage(Context context, String path, ImageView imageView) {
            Glide.with(context).load(path).into(imageView);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ImgSelConfig imgSelConfig = configureOption(false, false);
        ImgSelActivity.startActivity(this, imgSelConfig, 1);
    }

    public ImgSelConfig configureOption(boolean isTakePhoto, boolean isClips) {

        return new ImgSelConfig.Builder(this, loader)
                .multiSelect(false)
                .btnText("已选")
                .btnTextColor(Color.BLACK)
                .statusBarColor(Color.WHITE)
                .backResId(R.mipmap.photo_return)
                .title("图库")
                .titleColor(Color.BLACK)
                .titleBgColor(Color.parseColor("#ffffff"))
                .allImagesText("所有图片")
                .needCrop(isClips)
                .cropSize(1, 1, 200, 200)
                .maxNum(1)
                .needCamera(isTakePhoto)
                .build();
    }
}
