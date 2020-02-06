package com.example.productapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Viewac extends AppCompatActivity {

    TextView txt2;

    Button Homebtn;

    String name;
    int id, qty, qtyPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewac);

        txt2 = findViewById(R.id.txt2);

//        Homebtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent home = new Intent(Viewac.this,MainActivity.class);
//                startActivity(home);
//            }
//        });

        Product product = MainActivity.myProductDatabase.myDao().ViewProduct();

        for (int i = 0; i <= product.getId(); i++) {

            id = product.getId();
            name = product.getName();
            qty = product.getQuntity();
            qtyPrice = product.getQuntityPrice();
        }

//        txt2.setText("\nId :"+id+"\nName: "+name+"\nQty: "+qty+"\nPrice: "+qtyPrice);

        txt2.setText("\nId: "+String.valueOf(id)+"\nName: " + String.valueOf(name) + "\nQty: " + String.valueOf(qty) + "\nPrice: " + String.valueOf(qtyPrice));

    }
}
