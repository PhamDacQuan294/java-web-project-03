package com.javaweb.repository.custom.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username") private String username;
  @Column(name = "password") private String password;
  @Column(name = "fullname") private String fullName;
  @Column(name = "phone") private String phone;
  @Column(name = "email") private String email;
  @Column(name = "status") private Integer status;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private List<UserRoleEntity> userRoles = new ArrayList<>();

  @OneToMany(mappedBy = "staff", fetch = FetchType.LAZY)
  private List<AssignmentBuildingEntity> assignedBuildings = new ArrayList<>();

  @OneToMany(mappedBy = "staff", fetch = FetchType.LAZY)
  private List<AssignmentCustomerEntity> assignedCustomers = new ArrayList<>();
}
