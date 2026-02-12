package com.javaweb.converter;

import com.javaweb.entity.BuildingEntity;
import com.javaweb.entity.DistrictEntity;
import com.javaweb.entity.RentAreaEntity;
import com.javaweb.model.dto.BuildingDTO;
import com.javaweb.repository.DistrictRepository;
import com.javaweb.repository.RentAreaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class BuildingDTOConverter {
  @Autowired
  private DistrictRepository districtRepository;

  @Autowired
  private RentAreaRepository rentAreaRepository;

  @Autowired
  private ModelMapper modelMapper;

  public BuildingDTO toBuildingDTO(BuildingEntity item) {
    BuildingDTO building = modelMapper.map(item, BuildingDTO.class);

    Optional<DistrictEntity> districtEntity = districtRepository.findById(item.getDistrict().getId());
    building.setAddress(item.getStreet() + "," + item.getWard() + "," + districtEntity.get().getName());

    List<RentAreaEntity> rentAreas = rentAreaRepository.findByBuildingId(item.getId());
    String areaResult = rentAreas.stream()
      .map(ra -> String.valueOf(ra.getValue()))
      .collect(Collectors.joining(","));
    return building;
  }
}
