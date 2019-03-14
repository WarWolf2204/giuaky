package com.example.giabao_1706020004;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class aDapter extends ArrayAdapter<Model>{
    private Context mContext;
    private int mResouce;
    private List<Model> modelList;
    public aDapter( Context context, int resource,  List<Model> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResouce = resource;
        this.modelList =objects;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        ViewHolder ViewHolder = null;
        if (ViewHolder == null)
        {
            convertView = LayoutInflater.from(mContext).inflate(mResouce,parent,false);
             ViewHolder = new ViewHolder();
            ViewHolder.textViewname = convertView.findViewById(R.id.detail_NameSubject);
            ViewHolder.textViewcode = convertView.findViewById(R.id.detail_code);
            ViewHolder.textViewcredit = convertView.findViewById(R.id.detail_Credit);
        }
        else
        {
            ViewHolder = (ViewHolder)convertView.getTag();
        }
        Model themodel = modelList.get(position);
        ViewHolder.textViewname.setText(String.valueOf(themodel.getNamesubject()));
        ViewHolder.textViewcode.setText(String.valueOf(themodel.getCode()));
        ViewHolder.textViewcode.setText(String.valueOf(themodel.getCredit()));
        return convertView;
    }
    public class ViewHolder
    {
     TextView textViewname;
     TextView textViewcode;
     TextView textViewcredit;
    }
}
