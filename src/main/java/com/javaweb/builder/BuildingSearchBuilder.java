package com.javaweb.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class BuildingSearchBuilder {

  private String name;
  private Long floorArea;
  private String ward;
  private String street;
  private Long districtId;
  private Integer numberOfBasement;
  private List<String> typeCode;
  private String managerName;
  private String managerPhoneNumber;
  private Long rentPriceFrom;
  private Long rentPriceTo;
  private Long areaFrom;
  private Long areaTo;
  private Long staffId;

  private BuildingSearchBuilder(Builder builder) {
    this.name = builder.name;
    this.floorArea = builder.floorArea;
    this.ward = builder.ward;
    this.street = builder.street;
    this.districtId = builder.districtId;
    this.numberOfBasement = builder.numberOfBasement;
    this.typeCode = builder.typeCode;
    this.managerName = builder.managerName;
    this.managerPhoneNumber = builder.managerPhoneNumber;
    this.rentPriceFrom = builder.rentPriceFrom;
    this.rentPriceTo = builder.rentPriceTo;
    this.areaFrom = builder.areaFrom;
    this.areaTo = builder.areaTo;
    this.staffId = builder.staffId;
  }

  public static class Builder {
    private String name;
    private Long floorArea;
    private String ward;
    private String street;
    private Long districtId;
    private Integer numberOfBasement;
    private List<String> typeCode = new ArrayList<>();
    private String managerName;
    private String managerPhoneNumber;
    private Long rentPriceFrom;
    private Long rentPriceTo;
    private Long areaFrom;
    private Long areaTo;
    private Long staffId;

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setDistrictId(Long districtId) {
      this.districtId = districtId;
      return this;
    }

    public Builder setWard(String ward) {
      this.ward = ward;
      return this;
    }

    public Builder setStreet(String street) {
      this.street = street;
      return this;
    }

    public Builder setNumberOfBasement(Integer numberOfBasement) {
      this.numberOfBasement = numberOfBasement;
      return this;
    }

    public Builder setTypeCode(List<String> typeCode) {
      this.typeCode = typeCode;
      return this;
    }

    public Builder setRentPriceFrom(Long rentPriceFrom) {
      this.rentPriceFrom = rentPriceFrom;
      return this;
    }

    public Builder setRentPriceTo(Long rentPriceTo) {
      this.rentPriceTo = rentPriceTo;
      return this;
    }

    public Builder setAreaFrom(Long areaFrom) {
      this.areaFrom = areaFrom;
      return this;
    }

    public Builder setAreaTo(Long areaTo) {
      this.areaTo = areaTo;
      return this;
    }

    public Builder setStaffId(Long staffId) {
      this.staffId = staffId;
      return this;
    }

    public BuildingSearchBuilder build() {
      return new BuildingSearchBuilder(this);
    }
  }
}

