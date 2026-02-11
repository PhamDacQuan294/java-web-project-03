package com.javaweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

  @Column(name = "createddate")
  private LocalDateTime createdDate;

  @Column(name = "modifieddate")
  private LocalDateTime modifiedDate;

  @Column(name = "createdby")
  private String createdBy;

  @Column(name = "modifiedby")
  private String modifiedBy;
}
