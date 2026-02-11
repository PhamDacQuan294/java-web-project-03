package com.javaweb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "district")
public class DistrictEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "code")
  private String code;

  @Column(name = "name")
  private String name;

  @OneToMany(mappedBy = "district", fetch = FetchType.LAZY)
  private List<BuildingEntity> buildings = new ArrayList<>();
}
