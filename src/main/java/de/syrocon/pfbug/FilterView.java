package de.syrocon.pfbug;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("dtFilterView")
@SessionScoped
public class FilterView implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Car> cars;

    private List<Car> filteredCars;

    @Inject
    private CarService service;

    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }

    public List<String> getBrands() {
        return service.getBrands();
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getFilteredCars() {
        return filteredCars;
    }

    public void setFilteredCars(List<Car> filteredCars) {
        this.filteredCars = filteredCars;
    }

    public void setService(CarService service) {
        this.service = service;
    }
}