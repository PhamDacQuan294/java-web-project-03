package com.javaweb.controller.admin;

import com.javaweb.service.BuildingService;
import com.javaweb.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "buildingControllerOfAdmin")
public class BuildingController {

  @Autowired
  private BuildingService buildingService;

  @Autowired
  private UserService userService;

  // [GET] /admin/building-list
  @GetMapping(value = "/admin/building-list")
  public ModelAndView buildingList() {
    ModelAndView mav = new ModelAndView("admin/pages/buildings/list");
    mav.addObject("records", buildingService.index());
    mav.addObject("listStaffs", userService.getStaffs());
    return mav;
  }
}
