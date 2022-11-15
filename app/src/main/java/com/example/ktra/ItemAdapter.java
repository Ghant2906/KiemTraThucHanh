package com.example.ktra;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ItemAdapter extends BaseAdapter {
    private Activity activity;
    private List<CongAn> itemList;

    private class ViewHolder{
        ImageView Hinh;
        TextView txtTen, txtCapBac, txtNoiCongTac, txtquocGia;
    }

    public ItemAdapter(Activity activity, List<CongAn> itemList) {
        this.activity = activity;
        this.itemList = itemList;
    }

    public Context getContext() {
        return activity;
    }

    public void setContext(Context context) {
        this.activity = activity;
    }


    public List<CongAn> getItemList() {
        return itemList;
    }

    public void setItemList(List<CongAn> itemList) {
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            view = inflater.inflate(R.layout.layout_congan, null);

            holder = new ViewHolder();

            holder.txtTen = (TextView) view.findViewById(R.id.textViewTen);
            holder.txtCapBac = (TextView) view.findViewById(R.id.textViewCapBac);
            holder.txtNoiCongTac = (TextView) view.findViewById(R.id.textViewNoiCongTac);
            holder.txtquocGia = (TextView) view.findViewById(R.id.textViewQuocGia);
            holder.Hinh = (ImageView) view.findViewById(R.id.imageView2);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        CongAn congAn = itemList.get(i);

        holder.txtTen.setText(congAn.getTen());
        holder.txtCapBac.setText((congAn.getCapBac()));
        holder.txtNoiCongTac.setText(congAn.getNoiCongTac());
        holder.txtquocGia.setText(congAn.getQuocGia());
        holder.Hinh.setImageResource(congAn.getHinh());

        return view;
    }
}
