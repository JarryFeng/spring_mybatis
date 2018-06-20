package com.feng.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jarry on 2017/10/31.
 */
public class Good {
    private String name;

    private String note;

    private BigDecimal price;

    private Date productDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }
}
