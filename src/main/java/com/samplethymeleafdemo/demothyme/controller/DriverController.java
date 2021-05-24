package com.samplethymeleafdemo.demothyme.controller;

import com.samplethymeleafdemo.demothyme.model.Driver;
import com.samplethymeleafdemo.demothyme.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverRepository driverRepository;


    @GetMapping("show")
    public String displayName(Model model) {

        model.addAttribute("drivers", Arrays.asList(
                new Driver(1, "TOM"),
                new Driver(2, "REST")
        ));

        model.addAttribute("getDriver", driverRepository.findAll());
        return "index";
    }

}
