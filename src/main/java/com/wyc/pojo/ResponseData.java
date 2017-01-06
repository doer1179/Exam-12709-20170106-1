package com.wyc.pojo;

import java.util.List;

/**
 * Created by wyc on 2017/1/5.
 */
public class ResponseData<T>  {
    private int total;
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public ResponseData setTotal(int total) {
        this.total = total;
        return this;
    }

    public List<T> getRows() {
        return rows;
    }

    public ResponseData setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }
}
