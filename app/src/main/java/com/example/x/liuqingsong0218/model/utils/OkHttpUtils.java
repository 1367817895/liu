package com.example.x.liuqingsong0218.model.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @Auther: 刘青松
 * @Date: 2019/2/18 09:08:20
 * @Description:
 */
public class OkHttpUtils {

    private OkHttpUtils (){};
    private  static  OkHttpUtils okHttpUtils=null;

    public  static   OkHttpUtils  getinstance(){
        if (okHttpUtils ==null){
           okHttpUtils= new  OkHttpUtils();
        }return okHttpUtils; }
        private static Interceptor myIntercepter(){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    Log.e("message","拦截"+message);
                }
            });

return interceptor;
        }
public static boolean isNetWork(Context context){
    ConnectivityManager contextSystemService = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo info = contextSystemService.getActiveNetworkInfo();
return info.isAvailable();

}
public static String httpGet(String url){

    try {
        URL url1 = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
connection.setRequestMethod("GET");
        InputStream inputStream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        StringBuilder builder = new StringBuilder();
        String str="";
        while ((str=reader.readLine())!=null){
            builder.append(str);
       }
return builder.toString();

    } catch (Exception e) {
        e.printStackTrace();
    }


    return null;
}




//    public static  void  doGet(String url ,Callback callback){
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(myIntercepter())
//                .build();
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//        okHttpClient.newCall(request).enqueue(callback);
//
//
//    }public static  void  doPost(String url ,Callback callback){
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(myIntercepter())
//                .build();
//        FormBody.Builder builder = new FormBody.Builder();
//
//
//        Request request = new Request.Builder()
//                .url(url)
//                .post(builder.build())
//                .build();
//        okHttpClient.newCall(request).enqueue(callback);
//
//
//    }
}
