package com.concessionariat1.concessionariat1.service;

import com.concessionariat1.concessionariat1.dto.CarDto;
import com.concessionariat1.concessionariat1.model.Car;
import com.concessionariat1.concessionariat1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<CarDto> getAll() {
        List<Car> carList = carRepository.getAll();
        return carList.stream()
                .map(CarDto::new).collect(Collectors.toList());
    }

}
