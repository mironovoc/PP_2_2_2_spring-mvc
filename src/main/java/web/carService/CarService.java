package web.carService;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 2023));
        carList.add(new Car("AUDI", "Q8", 2020));
        carList.add(new Car("Honda", "Civic", 2010));
        carList.add(new Car("Lada", "Granta", 2017));
        carList.add(new Car("Skoda", "Rapid", 2017));
    }

    public List<Car> getCars(int count) {
        if (count > carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }


}
