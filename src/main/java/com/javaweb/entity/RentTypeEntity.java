package com.javaweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "renttype")
public class RentTypeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "code")
  private String code;

  @Column(name = "name")
  private String name;
}
