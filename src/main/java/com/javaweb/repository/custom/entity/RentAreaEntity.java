package com.javaweb.repository.custom.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "rentarea")
public class RentAreaEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "value")
  private Integer value;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "buildingid")
  private BuildingEntity building;
}
