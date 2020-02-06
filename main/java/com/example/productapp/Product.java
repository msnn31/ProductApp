package com.example.productapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "productTable")
public class Product {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "product_id")
    private int id;

    @NonNull
    @ColumnInfo(name = "product_name")
    private String name;

    @ColumnInfo(name = "product_quntity")
    private int quntity;

    @ColumnInfo(name = "product_price")
    private int quntityPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public int getQuntityPrice() {
        return quntityPrice;
    }

    public void setQuntityPrice(int quntityPrice) {
        this.quntityPrice = quntityPrice;
    }
}
