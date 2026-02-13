package com.javaweb.model.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UserDTO extends AbstractDTO{
  private String userName;
  private String fullName;
  private String password;
  private Integer status;
}
