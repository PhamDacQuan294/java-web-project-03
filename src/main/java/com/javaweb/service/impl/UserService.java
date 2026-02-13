package com.javaweb.service.impl;

import com.javaweb.converter.UserConverter;
import com.javaweb.entity.UserEntity;
import com.javaweb.model.dto.UserDTO;
import com.javaweb.repository.UserRepository;
import com.javaweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUserService {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserConverter userConverter;


  @Override
  public Map<Long, String> getStaffs() {
    Map<Long, String> listStaffs = new HashMap<>();
    List<UserEntity> staffs = userRepository.findByStatusAndUserRoles_Role_Code(1, "STAFF");
    for (UserEntity it : staffs) {
      listStaffs.put(it.getId(), it.getFullName());
    }
    return listStaffs;
  }
}
