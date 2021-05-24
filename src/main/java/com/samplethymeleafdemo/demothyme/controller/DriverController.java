package com.samplethymeleafdemo.demothyme.controller;

import com.samplethymeleafdemo.demothyme.model.Driver;
import com.samplethymeleafdemo.demothyme.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverRepository driverRepository;


    @GetMapping("/")
    public String displayName(Model model) {

        model.addAttribute("drivers", Arrays.asList(
                new Driver(1, "TOM"),
                new Driver(2, "REST")
        ));

        model.addAttribute("getDriver", driverRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addDriver(Model model, Driver driver) {
        model.addAttribute("driver", driver);
        driverRepository.save(driver);
        return "redirect:/driver/";
    }

    // USE this INSERT INTO  DRIVER_INFO(DRIVER_ID, DRIVER_NAME) VALUES(2, 'TEST');

    @GetMapping("/add")
    public String submitDriver(Driver driver) {
        return "AddDriver";
    }


}
