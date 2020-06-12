package pl.edu.wszib.project.cardiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.project.cardiary.dao.CarDao;
import pl.edu.wszib.project.cardiary.domain.Car;
import pl.edu.wszib.project.cardiary.dto.CarDTO;
import pl.edu.wszib.project.cardiary.service.CarService;

@Controller
public class CarController {


    @Autowired
    CarDao carDao;

    CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public String car(Integer id, Model model) {
        model.addAttribute("cardiary", service.getCar(id));
        return "cardiary";
    }

    @GetMapping("data")
    public String cars (Model model) {
        model.addAttribute("cars", service.listCar());
        return "data";
    }

    @GetMapping("data/new")
    public String newCar(Model model) {
        model.addAttribute("car", new CarDTO());
        return "new";
    }

    @PostMapping("data/new")
    public String saveCar(@ModelAttribute CarDTO car) {
        service.createCar(car);
        return "redirect:/data";
    }

    @GetMapping("data/edit/{id}")
    public String editCar(@PathVariable Integer id, Model model){
        model.addAttribute("car", service.getCar(id));
        return "edit";
    }

    @PostMapping("data/edit")
    public String editCar(@ModelAttribute CarDTO car){
        service.updateCar(car);
        return "redirect:/data/edit/" + car.getId();
    }

    @GetMapping("data/delete/{id}")
    public String deleteCar(@PathVariable Integer id){
        service.deleteCar(id);
        return "redirect:/data";
    }


}
