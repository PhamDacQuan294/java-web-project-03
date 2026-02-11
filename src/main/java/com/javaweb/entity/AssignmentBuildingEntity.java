package com.javaweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "assignmentbuilding")
public class AssignmentBuildingEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "staffid")
  private UserEntity staff;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "buildingid")
  private BuildingEntity building;
}
