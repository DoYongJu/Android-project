package com.example.yong.assignment1;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static MyAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.sample_0, "강원도", "130"));
        data.add(new MyItem(R.drawable.sample_1, "인천", "250"));
        data.add(new MyItem(R.drawable.sample_2, "경복궁", "300"));
        data.add(new MyItem(R.drawable.sample_3, "경북고", "220"));
//        data.add(new MyItem(R.drawable.sample_4, "부산", "480"));
        data.add(new MyItem(R.drawable.sample_5, "울산", "580"));
        data.add(new MyItem(R.drawable.sample_6, "제주도", "1720"));
        data.add(new MyItem(R.drawable.sample_7, "연평도", "320"));

        //어댑터 생성
        adapter = new MyAdapter(this, R.layout.item, data);

        //어댑터 연결
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        list.setDivider(new ColorDrawable(Color.GRAY));
        list.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                //   String name = (String) ((TextView)vClicked.findViewById(R.id.textItem1)).getText();
                String name = ((MyItem)adapter.getItem(position)).nLocation;
                Toast.makeText(MainActivity.this, name + " selected",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}