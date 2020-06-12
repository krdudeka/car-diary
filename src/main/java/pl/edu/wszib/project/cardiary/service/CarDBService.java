package pl.edu.wszib.project.cardiary.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.edu.wszib.project.cardiary.dao.CarDao;
import pl.edu.wszib.project.cardiary.domain.Car;
import pl.edu.wszib.project.cardiary.dto.CarDTO;

import java.util.Collection;

@Primary
@Service
public class CarDBService implements CarService{

    CarDao dao;
    CarMapper mapper;

    public CarDBService(CarDao dao, CarMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }


    @Override
    public Collection<CarDTO> listCar() {
        return mapper.toDTO(dao.findAll());
    }

    @Override
    public CarDTO getCar(Integer id) {
//        return dao.findById(id)
//                .map(s -> mapper.toDTO(s))
//                .orElseThrow(() -> new NotFoundException());
        return null;
    }


    @Override
    public void deleteCar(Integer id) {
        dao.deleteById(getCar(id).getId());
    }

    @Override
    public CarDTO createCar(CarDTO car) {
        return mapper.toDTO(dao.save(mapper.toDB(car)));
    }

    @Override
    public CarDTO updateCar(CarDTO car) {
        Car updateCar = dao.findById(car.getId()).get();
        updateCar.setMileage(car.getMileage());
        updateCar.setCarTank(car.getCarTank());
        updateCar.setCarTime(car.getCarTime());
        updateCar.setPricePerLiter(car.getPricePerLiter());
        updateCar.setTotalPrice(car.getTotalPrice());
        return mapper.toDTO(dao.save(updateCar));
    }
}
