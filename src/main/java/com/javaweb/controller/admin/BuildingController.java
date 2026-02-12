package com.javaweb.controller.admin;

import com.javaweb.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "buildingControllerOfAdmin")
public class BuildingController {

  @Autowired
  private BuildingService buildingService;

  // [GET] /admin/building-list
  @GetMapping(value = "/admin/buildings")
  public ModelAndView buildingList() {
    ModelAndView mav = new ModelAndView("admin/building/list");
    mav.addObject("records", buildingService.index());
    return mav;
  }
}
