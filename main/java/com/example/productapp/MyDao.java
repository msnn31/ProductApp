package com.example.productapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;


@Dao
public interface MyDao {

    @Insert
    public void addDetails(Product product);

    @Ignore
    @Query("select * from productTable")
    public Product ViewProduct();

}
