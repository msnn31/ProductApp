package com.example.productapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button continuebtn, decreaseqtybtn, increaseqtybtn;

    TextView qtynumtxt, qtypricetxt, txt;

    EditText edProductName;

    String name, q, pr, id;

    public static MyProductDatabase myProductDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myProductDatabase = Room.databaseBuilder(getApplicationContext(), MyProductDatabase.class, "productdb").allowMainThreadQueries().build();

        qtynumtxt = findViewById(R.id.qtynumtxt);
        qtypricetxt = findViewById(R.id.qtypricetxt);
        edProductName = findViewById(R.id.edProductName);
        txt = findViewById(R.id.txt);

        increaseqtybtn = findViewById(R.id.increaseqtybtn);
        increaseqtybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String p_name = edProductName.getText().toString();
                int p_qty = (Integer.parseInt(qtynumtxt.getText().toString())) + 1;
                int p_price = (p_qty * 300);
//                p.setName(p_name);
//                p.setQuntity(p_qty);
//                p.setQuntityPrice(p_price);
//
//                MainActivity.myProductDatabase.myDao().increaseQuntity(p);

//                qtynumtxt.setText(quntity);
                qtynumtxt.setText(String.valueOf(p_qty));
                qtypricetxt.setText(String.valueOf(p_price));
//                continuebtn.setText("Rs. "+price+" CONTINUE");
                continuebtn.setText("Rs." + String.valueOf(p_price) + " CONTINUE");
            }
        });

        decreaseqtybtn = findViewById(R.id.decreaseqtybtn);
        decreaseqtybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(qtynumtxt.getText().toString()) == 0)
                {
                    Toast.makeText(MainActivity.this, "Please select Quantity", Toast.LENGTH_SHORT).show();
                }

                else {

                    String p_name = edProductName.getText().toString();
                    int p_qty = (Integer.parseInt(qtynumtxt.getText().toString())-1);
                    int p_price = (p_qty*300);
//                    p.setName(product_name);
//                    p.setQuntity(quntity);
//                    p.setQuntityPrice(price);

//                    qtynumtxt.setText(quntity);
//                    continuebtn.setText("Rs."+price+" CONTINUE");
                    qtynumtxt.setText(String.valueOf(p_qty));
                    qtypricetxt.setText(String.valueOf(p_price));
                    continuebtn.setText("Rs. :"+String.valueOf(p_price)+" CONTINUE");
                }
            }
        });

        adddata();


//                        product_name = String.valueOf(edProductName.getText());
//                        qtynumtxt.setText(String.valueOf(q));
//                        qtypricetxt.setText(String.valueOf(pr));
//                        edProductName.setText(name);


//                    case R.id.decreaseqtybtn:
//                        Product product1 = myProductDatabase.myDao().getDetails();
////                        product.setName(product_name);
//                        name= product1.getName();
//                        q = product1.getQuntity();
//                        pr = product1.getQuntityPrice();
//                        edProductName.setText(name);
//                        break;


//        private void increaseQuntity () {


//    private void reduceQuntity() {
//
//    }
//



//                product_name = String.valueOf(edProductName.getText());
//                quntity = Integer.parseInt(qtynumtxt.getText().toString());
//                price = Integer.parseInt(qtypricetxt.getText().toString());
//                if (increaseqtybtn.isPressed()) {
//
//                    Product product = myProductDatabase.myDao().getDetails();
////                        product.setName(product_name);
//                    pid = product.getPid();
//                    name = product.getName();
//                    q = product.getQuntity();
//                    pr = product.getQuntityPrice();
////                        product_name = String.valueOf(edProductName.getText());
////                        qtynumtxt.setText(String.valueOf(q));
////                        qtypricetxt.setText(String.valueOf(pr));
//                    edProductName.setText(name);
//                }
//                else if (decreaseqtybtn.isPressed())
//                {
//                        Product product1 = myProductDatabase.myDao().getDetails();
////                        product.setName(product_name);
//                        name= product1.getName();
//                        q = product1.getQuntity();
//                        pr = product1.getQuntityPrice();
//                        edProductName.setText(name);
//                txt.setText("\n\nName: "+name+"\nQty: "+q+"\nPrice: "+pr);
//                }


//                qtynumtxt.setText(String.valueOf(q));
//                qtypricetxt.setText(String.valueOf(pr));
//                continuebtn.setText("CONTINUE");


//                Intent order = new Intent(MainActivity.this,Order.class);
//                String q_name= name;
//                int q_qty = q;
//                int q_price = pr;
//                order.putExtra("name",q_name);
//                order.putExtra("qty",q_qty);
//                order.putExtra("price",q_price);
//                startActivity(order);

//                order.putExtra("qty",q);
//                order.putExtra("price",pr);

//                myProductDatabase.myDao().addData(product);


//                Toast.makeText(MainActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();

//viewDetails();
    }

    private void adddata() {
        continuebtn = findViewById(R.id.continuebtn);

        continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                        product.setName(product_name);
                    name = String.valueOf(edProductName);
                Intent order = new Intent(MainActivity.this,Order.class);
                order.putExtra("name", edProductName.getText().toString());
                order.putExtra("qty", qtynumtxt.getText().toString());
                order.putExtra("price",qtypricetxt.getText().toString());
                startActivity(order);q = String.valueOf(qtynumtxt);
                    pr = String.valueOf(qtypricetxt);

//                    Product product = new Product();
//                    product.setName(name);
//                    product.setQuntity(q);
//                    product.setQuntityPrice(pr);
//
//                    MainActivity.myProductDatabase.myDao().addDetails(product);


            }
        });
    }

    private void viewDetails() {





//        txt.setText("Id: " + p_id + "\nName: " + Pname + "\nQty: " + p_qty+ "\nPrice: " + p_price);
    }
}

