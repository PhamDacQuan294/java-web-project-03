package com.javaweb.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuildingDTO {
  private String name;
  private String address;
  private String managerName;
  private String managerPhoneNumber;
  private Integer floorArea;
  private String rentArea;
  private String emptyArea;
  private Long rentPrice;
  private String serviceFee;
  private Long brokerageFee;
  private String district;
}
