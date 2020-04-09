package com.example.myapplication.Room2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "biodata_table")
public class BioData {

    @ColumnInfo(name = "sl_no")
    @PrimaryKey(autoGenerate = true)
    private int slNo;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "address")
    private String address;

    @ColumnInfo(name = "age")
    private int age;

    public BioData(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setSlNo(int slNo) {
        this.slNo = slNo;
    }

    public int getSlNo() {
        return slNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

}
