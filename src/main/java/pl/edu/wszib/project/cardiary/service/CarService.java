package pl.edu.wszib.project.cardiary.service;

import pl.edu.wszib.project.cardiary.dto.CarDTO;

import java.util.Collection;

public interface CarService {

    Collection<CarDTO> listCar();
    CarDTO getCar(Integer id);
    void deleteCar(Integer id);
    CarDTO createCar(CarDTO carDTO);
    CarDTO updateCar(CarDTO carDTO);

}
