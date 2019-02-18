package com.example.x.liuqingsong0218.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.x.liuqingsong0218.R;
import com.example.x.liuqingsong0218.model.bean.JavaBean;
import com.example.x.liuqingsong0218.model.bean.NewsBean;
import com.example.x.liuqingsong0218.model.utils.OkHttpUtils;
import com.example.x.liuqingsong0218.view.adapter.myAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  String ss="http://365jia.cn/news/api3/365jia/news/headline";
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        Gson gson = new Gson();
        NewsBean newsBean = gson.fromJson(ss, NewsBean.class);



        ArrayList<JavaBean> list = new ArrayList<>();
        list.add(new JavaBean(R.drawable.img1,"1.使用MVP架构模式，分层明确，注意内存优化，避免内存泄漏"));
        list.add(new JavaBean(R.drawable.img2," 15.\t通过文字或流程图等分析需求，形成完整解决问题思路；"));
        list.add(new JavaBean(R.drawable.img3,"1.使用MVP架构模式，分层明确，注意内存优化，避免内存泄漏"));
        list.add(new JavaBean(R.drawable.img4,"1.使用MVP架构模式，分层明确，注意内存优化，避免内存泄漏"));
        list.add(new JavaBean(R.drawable.img5,"1.使用MVP架构模式，分层明确，注意内存优化，避免内存泄漏"));
        myAdapter myAdapter = new myAdapter(list,MainActivity.this);

        listView.setAdapter(myAdapter);
    }

    private void initView() {
        listView = findViewById(R.id.listview);


    }
}
