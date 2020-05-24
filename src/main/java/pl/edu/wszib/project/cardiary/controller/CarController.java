package pl.edu.wszib.project.cardiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.project.cardiary.dao.CarDao;

@Controller
public class CarController {


    @Autowired
    private CarDao carDao;


    @GetMapping
    public String car(Model model) {
        model.addAttribute("cardiary", carDao.getCar());
        return "cardiary";
    }



}
