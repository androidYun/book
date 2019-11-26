package com.ziming.book.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：book
 *
 * @author ${param.author}
 */
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "book_number")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：book_number */
    private Integer bookNumber;

    /**  数据库字段：book_name */
    private String bookName;

    /**  数据库字段：price */
    private BigDecimal price;

    /**  数据库字段：author */
    private String author;

    /**  数据库字段：sk_number */
    private Integer skNumber;

    /**  数据库字段：book.book_number */
    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }

    /**  数据库字段：book.book_number */
    public Integer getBookNumber() {
        return this.bookNumber;
    }

    /**  数据库字段：book.book_name */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**  数据库字段：book.book_name */
    public String getBookName() {
        return this.bookName;
    }

    /**  数据库字段：book.price */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**  数据库字段：book.price */
    public BigDecimal getPrice() {
        return this.price;
    }

    /**  数据库字段：book.author */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**  数据库字段：book.author */
    public String getAuthor() {
        return this.author;
    }

    /**  数据库字段：book.sk_number */
    public void setSkNumber(Integer skNumber) {
        this.skNumber = skNumber;
    }

    /**  数据库字段：book.sk_number */
    public Integer getSkNumber() {
        return this.skNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((bookNumber == null) ? 0 : bookNumber.hashCode());

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

        Book other = (Book) obj;

        if (bookNumber == null) {
            if (other.bookNumber != null) {
                return false;
            }
        } else if (!bookNumber.equals(other.bookNumber)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book [");
        sb.append("bookNumber=").append(bookNumber);
        sb.append(", ");
        sb.append("bookName=").append(bookName);
        sb.append(", ");
        sb.append("price=").append(price);
        sb.append(", ");
        sb.append("author=").append(author);
        sb.append(", ");
        sb.append("skNumber=").append(skNumber);
        sb.append("]");

        return sb.toString();
    }
}
