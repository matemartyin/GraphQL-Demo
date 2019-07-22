package matemartyin.graphql_demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarProvider {
    private Map<Integer, Car> cars;

    public CarProvider() {
        this.cars = createCars();
    }

    private Map<Integer, Car> createCars() {
        Map<Integer, Car> newCars = new HashMap<>();
        String[] vendors = {"BMW", "AUDI", "MERCEDES", "VOLKSWAGEN", "OPEL", "SUZUKI"};
        for (int i = 0; i < 30; i++) {
            Car car = new Car();
            car.setVendor(vendors[i % vendors.length]);
            int maxNumOfSeats = 7;
            car.setNumberOfSeats(i % maxNumOfSeats);
            newCars.put(i, car);
        }
        return newCars;
    }

    public Car getCar(Integer id) {
        return this.cars.get(id);
    }
 }
