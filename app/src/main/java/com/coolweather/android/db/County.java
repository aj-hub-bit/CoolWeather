package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String CountyName;
    private int CountyCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public int getCountyCode() {
        return CountyCode;
    }

    public void setCountyCode(int countyCode) {
        CountyCode = countyCode;
    }
}
