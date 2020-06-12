package pl.edu.wszib.project.cardiary.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.project.cardiary.domain.Car;

import java.util.Date;
import java.util.List;

@Repository
public interface CarDao extends CrudRepository<Car, Integer> {

    @Override
    List<Car> findAll();

    @Override
    List<Car> findAllById(Iterable<Integer> integers);

    List<Car> findAllByCarTime(Date carTime);

    List<Car> findAllByOrderById();
}
