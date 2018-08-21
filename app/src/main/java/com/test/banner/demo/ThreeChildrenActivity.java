package com.test.banner.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.test.banner.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

/**
 * 项目名称：com.test.banner.demo
 * 项目版本：banner
 * 创建时间：2018.08.21 15:23  星期二
 * 创建人：Daimhim
 * 修改时间：2018.08.21 15:23  星期二
 * 类描述：Daimhim 太懒了，什么都没有留下
 * 修改备注：Daimhim 太懒了，什么都没有留下
 *
 * @author：Daimhim
 */
public class ThreeChildrenActivity extends AppCompatActivity {

    private Banner mBBanner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_children);
        initView();
    }

    private void initView() {
        mBBanner = (Banner) findViewById(R.id.b_banner);
        ArrayList<String> lStrings = new ArrayList<>();
        lStrings.add("http://pic1.win4000.com/wallpaper/8/58f5a79da3b60.jpg");
        lStrings.add("http://himg2.huanqiu.com/attachment2010/2017/0503/14/47/20170503024755104.jpg");
        lStrings.add("https://image.tmdb.org/t/p/original/wdxWpq6lzgWxH8N8YgqQmLPvgn5.jpg");
        lStrings.add("http://image.jisuxz.com/desktop/1834/jisuxz_wangzhe_yadianna_1_05.jpg");
        lStrings.add("http://i.imgur.com/R0ySZg5.jpg");
        lStrings.add("http://pic1.win4000.com/wallpaper/7/5902e207bc663.jpg");
        lStrings.add("https://cn.best-wallpaper.net/wallpaper/1920x1080/1608/Gal-Gadot-as-Wonder-Woman_1920x1080.jpg");
        mBBanner.setImages(lStrings);
        mBBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        });
        mBBanner.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //开始轮播
        mBBanner.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
        mBBanner.stopAutoPlay();
    }
}
