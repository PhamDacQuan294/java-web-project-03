package com.javaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "Dashboard")
public class DashBoardController {

  // [GET] /admin/dashboard
  @GetMapping(value = "/admin/dashboard")
  public ModelAndView dashboard() {
    ModelAndView mav = new ModelAndView("admin/pages/home/index");
    return mav;
  }
}
