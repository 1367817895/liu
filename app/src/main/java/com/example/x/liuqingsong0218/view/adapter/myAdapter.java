package com.example.x.liuqingsong0218.view.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.x.liuqingsong0218.R;
import com.example.x.liuqingsong0218.model.bean.JavaBean;
import com.example.x.liuqingsong0218.view.activity.MainActivity;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * @Auther: 刘青松
 * @Date: 2019/2/18 09:42:42
 * @Description:
 */
public class myAdapter extends BaseAdapter {
    ArrayList<JavaBean> list;
    Context context;
    private ViewHolder holder;

    public myAdapter(ArrayList<JavaBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
            holder = new ViewHolder();
holder.img=convertView.findViewById(R.id.img1);
holder.test1=convertView.findViewById(R.id.text1);
convertView.setTag(holder);

        }else {
            holder= (ViewHolder) convertView.getTag();

        }
        JavaBean javaBean = list.get(position);
         holder.test1.setText(list.get(position).getName());
        return convertView;
    }
    class ViewHolder{
        ImageView img;
        TextView test1;

    }
}
