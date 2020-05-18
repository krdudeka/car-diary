package pl.edu.wszib.project.cardiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.project.cardiary.dao.CarDao;

@Controller
public class CarController {

    @GetMapping("car-diary")
    public String carDiary(Model model) {
        model.addAttribute("carName", "Samochód");
        model.addAttribute("monthlyFuelCost", "500 zł");
        model.addAttribute("monthlyCostOfRepairs", "500 zł");
        return "car-diary";
    }



}
