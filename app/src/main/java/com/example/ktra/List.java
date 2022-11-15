package com.example.ktra;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    ListView lvItem;
    static ArrayList<CongAn> congAnArrayList;
    ItemAdapter adapter;
    static int viTri= -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        lvItem = (ListView) findViewById(R.id.listViewItem);
        congAnArrayList = new ArrayList<>();

        congAnArrayList.add(new CongAn("Nguyễn Hoàng Long","Thượng tá","Đà Nẵng","Việt Nam", R.drawable.hoanglong));
        congAnArrayList.add(new CongAn("Lê Hồng Thắng","Đại tá","Hải Phòng","Việt Nam", R.drawable.lehongthang));


        adapter = new ItemAdapter(this, congAnArrayList);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                viTri = i;
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(List.this);
                alertDialog.setTitle("Xóa Item?");
                alertDialog.setMessage("Bạn chắc chắn muốn xóa?");
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(List.this, "Xóa thành công", Toast.LENGTH_SHORT).show();
                        congAnArrayList.remove(viTri);
                        adapter.notifyDataSetChanged();
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                alertDialog.show();
                return true;
            }
        });
    }
}