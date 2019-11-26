package com.ziming.book.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：master
 *
 * @author ${param.author}
 */
@Table(name = "master")
public class Master {
    @Id
    @Column(name = "master_number")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：master_number */
    private Integer masterNumber;

    /**  数据库字段：master_name */
    private String masterName;

    /**  数据库字段：sex */
    private String sex;

    /**  数据库字段：sk_number */
    private Integer skNumber;

    /**  数据库字段：master.master_number */
    public void setMasterNumber(Integer masterNumber) {
        this.masterNumber = masterNumber;
    }

    /**  数据库字段：master.master_number */
    public Integer getMasterNumber() {
        return this.masterNumber;
    }

    /**  数据库字段：master.master_name */
    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    /**  数据库字段：master.master_name */
    public String getMasterName() {
        return this.masterName;
    }

    /**  数据库字段：master.sex */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**  数据库字段：master.sex */
    public String getSex() {
        return this.sex;
    }

    /**  数据库字段：master.sk_number */
    public void setSkNumber(Integer skNumber) {
        this.skNumber = skNumber;
    }

    /**  数据库字段：master.sk_number */
    public Integer getSkNumber() {
        return this.skNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) +
            ((masterNumber == null) ? 0 : masterNumber.hashCode());

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

        Master other = (Master) obj;

        if (masterNumber == null) {
            if (other.masterNumber != null) {
                return false;
            }
        } else if (!masterNumber.equals(other.masterNumber)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Master [");
        sb.append("masterNumber=").append(masterNumber);
        sb.append(", ");
        sb.append("masterName=").append(masterName);
        sb.append(", ");
        sb.append("sex=").append(sex);
        sb.append(", ");
        sb.append("skNumber=").append(skNumber);
        sb.append("]");

        return sb.toString();
    }
}
