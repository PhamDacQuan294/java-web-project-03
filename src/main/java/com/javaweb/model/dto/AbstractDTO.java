package com.javaweb.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class AbstractDTO<T> {
  private Long id;
  private Date createdDate;
  private String createdBy;
  private Date modifiedDate;
  private String modifiedBy;
}
