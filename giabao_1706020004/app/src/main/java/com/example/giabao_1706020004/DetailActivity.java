package com.example.giabao_1706020004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    ListView listView;
    List<Model> theModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        onint();
        onsetdata();
        aDapter aDapter = new aDapter(DetailActivity.this,R.layout.detail_item,theModel);
        listView.setAdapter(aDapter);
    }

    private void onsetdata() {
        theModel = new ArrayList();
        theModel.add(new Model("android","and1245","4"));
        theModel.add(new Model("english","anh1245","3"));
        theModel.add(new Model("php","php1245","4"));
    }

    private void onint() {
       listView = findViewById(R.id.lv_detail);
    }
}
