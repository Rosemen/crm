package com.scau.crm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 联系人实体类
 *
 * @author chen
 * @date 2019/02/27
 */
@Data
public class LinkMan implements Serializable {
   private static final long serialVersionUID = 1L;
   private String linkId;
   private String linkName;
   private Integer linkGender;
   private String linkPhone;
   private String linkMobile;
   private String linkEmail;
   private String linkPosition;
   private String linkMemo;
   private Customer belongCustomer;
}
