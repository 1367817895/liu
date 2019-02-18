package com.example.x.liuqingsong0218.model.app;

import android.app.Application;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * @Auther: 刘青松
 * @Date: 2019/2/18 10:30:12
 * @Description:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DisplayImageOptions options = new DisplayImageOptions.Builder().build();
        ImageLoaderConfiguration build = new ImageLoaderConfiguration.Builder(this)
                .defaultDisplayImageOptions(options)
                .build();
        ImageLoader imageLoader = ImageLoader.getInstance();
imageLoader.init(build);

    }
}
