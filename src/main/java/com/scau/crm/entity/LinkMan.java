package com.scau.crm.entity;

import lombok.Data;

/**
 * 联系人实体类
 *
 * @author chen
 * @date 2019/02/27
 */
@Data
public class LinkMan {
   private String linkId;
   private String linkName;
   private Integer linkGender;
   private String linkPhone;
   private String linkMobile;
   private String linkEmail;
   private String linkPosition;
   private String linkMemo;
}
