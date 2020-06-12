package pl.edu.wszib.project.cardiary.service;

import org.mapstruct.Mapper;
import pl.edu.wszib.project.cardiary.domain.Car;
import pl.edu.wszib.project.cardiary.dto.CarDTO;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDTO toDTO(Car car);
    Car toDB(CarDTO carDTO);
    List<CarDTO> toDTO(List<Car> carList);

}
