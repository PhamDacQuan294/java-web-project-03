package com.javaweb.repository.custom.impl;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.repository.custom.BuildingRepositoryCustom;
import com.javaweb.entity.BuildingEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@PropertySource("classpath:application.properties")
public class BuildingRepositoryImpl implements BuildingRepositoryCustom {
  @Value("${spring.datasource.url}")
  private String DB_URL;

  @Value("${spring.datasource.username}")
  private String USER;

  @Value("${spring.datasource.password}")
  private String PASS = "123456";

  @Override
  public List<BuildingEntity> findAll(BuildingSearchBuilder buildingSearchBuilder) {
    return List.of();
  }
}
