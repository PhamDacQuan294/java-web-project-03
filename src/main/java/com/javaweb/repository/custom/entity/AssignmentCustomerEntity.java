package com.javaweb.repository.custom.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "assignmentcustomer")
public class AssignmentCustomerEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "staffid")
  private UserEntity staff;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customerid")
  private CustomerEntity customer;
}
