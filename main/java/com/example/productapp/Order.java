package com.example.productapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static com.example.productapp.MainActivity.myProductDatabase;

public class Order extends AppCompatActivity {

    TextView order_qtynumtxt, order_qtyPricetxt, pName, txt2;
    Button placeorderbtn;
    String name;
    int qty, qtyPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String name_details = intent.getStringExtra("name");
        final String quntity = intent.getStringExtra("qty");
        String price = intent.getStringExtra("price");

        pName = findViewById(R.id.pName);
        order_qtynumtxt = findViewById(R.id.order_qtynumtxt);
        order_qtyPricetxt = findViewById(R.id.order_qtyPricetxt);

        pName.setText("Name: " + String.valueOf(name_details));
        order_qtynumtxt.setText(String.valueOf(quntity));
        order_qtyPricetxt.setText(String.valueOf(price));

        placeorderbtn = findViewById(R.id.placeorderbtn);

        placeorderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Product p = new Product();

                name = pName.getText().toString();
                qty = Integer.parseInt(order_qtynumtxt.getText().toString());
                qtyPrice = Integer.parseInt(order_qtyPricetxt.getText().toString());

                p.setName(name);
                p.setQuntity(qty);
                p.setQuntityPrice(qtyPrice);

                MainActivity.myProductDatabase.myDao().addDetails(p);

                Toast.makeText(Order.this, "Data Saved....", Toast.LENGTH_SHORT).show();

                Intent viewa = new Intent(Order.this,Viewac.class);
                startActivity(viewa);
            }
        });


//
//
//        pName.setText(p.getName());
//        order_qtynumtxt.setText(String.valueOf(p.getQuntity()));
//        order_qtyPricetxt.setText(String.valueOf(p.getQuntityPrice()));

//        Product products = myProductDatabase.myDao().getDetails();

//        List<Product> p = myProductDatabase.myDao().getDetails();

//        for (int i=0;i<=products.getPid();i++) {
//
//            name = products.getName();
//            qty = products.getQuntity();
//            price = products.getQuntityPrice();
//        }

//        pName.setText(name_details);
//        order_qtynumtxt.setText(q_details);
//        order_qtyPricetxt.setText(p_details);
//
//        pName.setText(String.valueOf(name_details));

    }

}
