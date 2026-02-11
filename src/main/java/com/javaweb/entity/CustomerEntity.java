package com.javaweb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "fullname")
  private String fullName;

  @Column(name = "phone")
  private String phone;

  @Column(name = "email")
  private String email;

  @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
  private List<TransactionEntity> transactions = new ArrayList<>();

  @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
  private List<AssignmentCustomerEntity> assignments = new ArrayList<>();
}
