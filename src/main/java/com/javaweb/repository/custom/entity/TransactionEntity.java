package com.javaweb.repository.custom.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "transaction")
public class TransactionEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "note")
  private String note;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customerid")
  private CustomerEntity customer;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "type")
  private TransactionTypeEntity transactionType;
}
