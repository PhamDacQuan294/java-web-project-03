package com.javaweb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name") private String name;
  @Column(name = "code") private String code;

  @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
  private List<UserRoleEntity> userRoles = new ArrayList<>();
}
