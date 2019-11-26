package com.ziming.book.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：shuku
 *
 * @author ${param.author}
 */
@Table(name = "shuku")
public class Shuku {
    @Id
    @Column(name = "sk_number")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：sk_number */
    private Integer skNumber;

    /**  数据库字段：lacate */
    private String lacate;

    /**  数据库字段：tel */
    private String tel;

    /**  数据库字段：shuku.sk_number */
    public void setSkNumber(Integer skNumber) {
        this.skNumber = skNumber;
    }

    /**  数据库字段：shuku.sk_number */
    public Integer getSkNumber() {
        return this.skNumber;
    }

    /**  数据库字段：shuku.lacate */
    public void setLacate(String lacate) {
        this.lacate = lacate;
    }

    /**  数据库字段：shuku.lacate */
    public String getLacate() {
        return this.lacate;
    }

    /**  数据库字段：shuku.tel */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**  数据库字段：shuku.tel */
    public String getTel() {
        return this.tel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((skNumber == null) ? 0 : skNumber.hashCode());

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

        Shuku other = (Shuku) obj;

        if (skNumber == null) {
            if (other.skNumber != null) {
                return false;
            }
        } else if (!skNumber.equals(other.skNumber)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shuku [");
        sb.append("skNumber=").append(skNumber);
        sb.append(", ");
        sb.append("lacate=").append(lacate);
        sb.append(", ");
        sb.append("tel=").append(tel);
        sb.append("]");

        return sb.toString();
    }
}
