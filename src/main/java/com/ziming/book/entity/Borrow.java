package com.ziming.book.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：borrow
 *
 * @author ${param.author}
 */
@Table(name = "borrow")
public class Borrow {
    @Id
    @Column(name = "js_number")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：js_number */
    private String jsNumber;

    /**  数据库字段：book_number */
    private String bookNumber;

    /**  数据库字段：b_date */
    private Date bDate;

    /**  数据库字段：r_date */
    private Date rDate;

    /**  数据库字段：borrow.js_number */
    public void setJsNumber(String jsNumber) {
        this.jsNumber = jsNumber;
    }

    /**  数据库字段：borrow.js_number */
    public String getJsNumber() {
        return this.jsNumber;
    }

    /**  数据库字段：borrow.book_number */
    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    /**  数据库字段：borrow.book_number */
    public String getBookNumber() {
        return this.bookNumber;
    }

    /**  数据库字段：borrow.b_date */
    public void setBDate(Date bDate) {
        this.bDate = bDate;
    }

    /**  数据库字段：borrow.b_date */
    public Date getBDate() {
        return this.bDate;
    }

    /**  数据库字段：borrow.r_date */
    public void setRDate(Date rDate) {
        this.rDate = rDate;
    }

    /**  数据库字段：borrow.r_date */
    public Date getRDate() {
        return this.rDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((jsNumber == null) ? 0 : jsNumber.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Borrow other = (Borrow) obj;

        if (jsNumber == null) {
            if (other.jsNumber != null) {
                return false;
            }
        } else if (!jsNumber.equals(other.jsNumber)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Borrow [");
        sb.append("jsNumber=").append(jsNumber);
        sb.append(", ");
        sb.append("bookNumber=").append(bookNumber);
        sb.append(", ");
        sb.append("bDate=").append(bDate);
        sb.append(", ");
        sb.append("rDate=").append(rDate);
        sb.append("]");

        return sb.toString();
    }
}
