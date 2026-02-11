package com.javaweb.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "transactiontype")
public class TransactionTypeEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "code")
  private String code;
}
