package com.wojdlu.covidapp.com.wojdlu.covidapp.controllers;

import com.wojdlu.covidapp.models.LocationStats;
import com.wojdlu.covidapp.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = covidDataService.getAllStats();
        int allCases = allStats.stream().mapToInt(LocationStats::getLatestLocalCases).sum();
        int allNewCases = allStats.stream().mapToInt(LocationStats::getDiffBetweenYesterdayAndToday).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("allCases", allCases);
        model.addAttribute("allNewCases", allNewCases);
        return "home";
    }
}
