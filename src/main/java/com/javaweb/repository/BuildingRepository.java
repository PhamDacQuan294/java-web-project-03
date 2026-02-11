package com.javaweb.repository;

import com.javaweb.repository.custom.entity.BuildingEntity;

import java.util.List;

public interface BuildingRepository {
  List<BuildingEntity> findAll(String name, Integer numberOfBasement);
}
