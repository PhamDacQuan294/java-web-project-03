package com.javaweb.repository.custom.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "buildingrenttype")
public class BuildingRentTypeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "buildingid")
  private BuildingEntity building;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "renttypeid")
  private RentTypeEntity rentType;
}
