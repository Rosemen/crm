package com.scau.crm.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseDict implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dictId;
    private String dictTypeCode;
    private String dictTypeName;
    private String dictItemName;
    private String dictItemCode;
    private Integer dictSort;
    private String dictEnable;
    private String dictMemo;

}