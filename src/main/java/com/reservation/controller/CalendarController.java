package com.reservation.controller;

import com.reservation.constant.Month;
import com.reservation.util.CalendarUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class CalendarController {

    @GetMapping("/index")
    public String homePage(@RequestParam(name = "year",required = false,defaultValue = "0") int year,
                           @RequestParam(name = "month",required = false,defaultValue = "0") String month,
                           Model model){
        if (year == 0 || month.equals("0")) {
            LocalDate today = LocalDate.now();
            year = today.getYear();
            month = today.getMonth().toString();
        }
        model.addAttribute("year",year);
        model.addAttribute("month",month);

        LocalDate[] daysOfMonth = CalendarUtil.getDaysOfMonth(Month.valueOf(month.toLowerCase()), year);
        model.addAttribute("daysOfMonth", daysOfMonth);
        return "index";
    }


}
