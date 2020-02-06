package com.example.productapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Product.class},version = 1)
public abstract class MyProductDatabase extends RoomDatabase {

    public abstract MyDao myDao();
}
