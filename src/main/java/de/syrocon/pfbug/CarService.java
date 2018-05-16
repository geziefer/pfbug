package de.syrocon.pfbug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("carService")
@ApplicationScoped
public class CarService {

    private final static String[] brands;

    static {
        brands = new String[10];
        brands[0] = "BMW";
        brands[1] = "Mercedes";
        brands[2] = "Volvo";
        brands[3] = "Audi";
        brands[4] = "Renault";
        brands[5] = "Fiat";
        brands[6] = "Volkswagen";
        brands[7] = "Honda";
        brands[8] = "Jaguar";
        brands[9] = "Ford";
    }

    public List<Car> createCars(int size) {
        List<Car> list = new ArrayList<Car>();
        for (int i = 0; i < size; i++) {
            list.add(new Car(i, getRandomBrand()));
        }

        return list;
    }

    private String getRandomBrand() {
        return brands[(int) (Math.random() * 10)];
    }

    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
}