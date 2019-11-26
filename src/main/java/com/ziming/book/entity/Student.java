package com.ziming.book.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 表名：student
 *
 * @author ${param.author}
 */
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "sno")
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**  数据库字段：sno */
    private String sno;

    /**  数据库字段：sn */
    private String sn;

    /**  数据库字段：age */
    private Integer age;

    /**  数据库字段：class_name */
    private String className;

    /**  数据库字段：js_number */
    private String jsNumber;

    /**  数据库字段：student.sno */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**  数据库字段：student.sno */
    public String getSno() {
        return this.sno;
    }

    /**  数据库字段：student.sn */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /**  数据库字段：student.sn */
    public String getSn() {
        return this.sn;
    }

    /**  数据库字段：student.age */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**  数据库字段：student.age */
    public Integer getAge() {
        return this.age;
    }

    /**  数据库字段：student.class_name */
    public void setClassName(String className) {
        this.className = className;
    }

    /**  数据库字段：student.class_name */
    public String getClassName() {
        return this.className;
    }

    /**  数据库字段：student.js_number */
    public void setJsNumber(String jsNumber) {
        this.jsNumber = jsNumber;
    }

    /**  数据库字段：student.js_number */
    public String getJsNumber() {
        return this.jsNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((sno == null) ? 0 : sno.hashCode());

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

        Student other = (Student) obj;

        if (sno == null) {
            if (other.sno != null) {
                return false;
            }
        } else if (!sno.equals(other.sno)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student [");
        sb.append("sno=").append(sno);
        sb.append(", ");
        sb.append("sn=").append(sn);
        sb.append(", ");
        sb.append("age=").append(age);
        sb.append(", ");
        sb.append("className=").append(className);
        sb.append(", ");
        sb.append("jsNumber=").append(jsNumber);
        sb.append("]");

        return sb.toString();
    }
}
