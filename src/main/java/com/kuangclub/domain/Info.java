package com.kuangclub.domain;

import java.io.Serializable;

public class Info implements Serializable {
    private Byte code;

    private String type;

    private String name;

    private static final long serialVersionUID = 1L;

    public Byte getCode() {
        return code;
    }

    public void setCode(Byte code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}