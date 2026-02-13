package com.javaweb.service.impl;

import com.javaweb.converter.BuildingDTOConverter;
import com.javaweb.entity.BuildingEntity;
import com.javaweb.entity.DistrictEntity;
import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.model.response.ResponseDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.DistrictRepository;
import com.javaweb.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingServiceImpl implements BuildingService {
  @Autowired
  private BuildingRepository buildingRepository;

  @Autowired
  private BuildingDTOConverter buildingDTOConverter;

  @Override
  public List<BuildingDTO> index() {
    return buildingRepository.findAll()
      .stream()
      .map(buildingDTOConverter::toBuildingDTO)
      .toList();
  }
}
