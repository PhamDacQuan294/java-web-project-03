package com.javaweb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "building")
public class BuildingEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name") private String name;
  @Column(name = "street") private String street;
  @Column(name = "ward") private String ward;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "districtid")
  private DistrictEntity district;

  @Column(name = "structure") private String structure;
  @Column(name = "numberofbasement") private Integer numberOfBasement;
  @Column(name = "floorarea") private Integer floorArea;
  @Column(name = "direction") private String direction;
  @Column(name = "level") private String level;
  @Column(name = "rentprice") private Integer rentPrice;
  @Column(name = "rentpricedescription") private String rentPriceDescription;
  @Column(name = "servicefee") private String serviceFee;
  @Column(name = "carfee") private String carFee;
  @Column(name = "motorbikefee") private String motorbikeFee;
  @Column(name = "overtimefee") private String overtimeFee;
  @Column(name = "waterfee") private String waterFee;
  @Column(name = "electricityfee") private String electricityFee;
  @Column(name = "deposit") private String deposit;
  @Column(name = "payment") private String payment;
  @Column(name = "renttime") private String rentTime;
  @Column(name = "decorationtime") private String decorationTime;
  @Column(name = "brokeragefee") private BigDecimal brokerageFee;
  @Column(name = "note") private String note;
  @Column(name = "linkofbuilding") private String linkOfBuilding;
  @Column(name = "map") private String map;
  @Column(name = "image") private String image;

  // ===== relations =====
  @OneToMany(mappedBy = "building", fetch = FetchType.LAZY)
  private List<RentAreaEntity> rentAreas = new ArrayList<>();

  @OneToMany(mappedBy = "building", fetch = FetchType.LAZY)
  private List<AssignmentBuildingEntity> assignments = new ArrayList<>();

  @OneToMany(mappedBy = "building", fetch = FetchType.LAZY)
  private List<BuildingRentTypeEntity> buildingRentTypes = new ArrayList<>();
}
