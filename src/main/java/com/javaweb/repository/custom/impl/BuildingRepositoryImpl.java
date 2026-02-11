package com.javaweb.repository.custom.impl;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.custom.entity.BuildingEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

  @Override
  public List<BuildingEntity> findAll(String name, Integer numberOfBasement) {
    return null;
  }
}
