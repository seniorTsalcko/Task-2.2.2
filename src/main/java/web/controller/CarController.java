package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.carServiseImpl;
import java.util.List;

@Controller
public class CarController {

@GetMapping(value = "/cars")
    public String manyCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
    carServiseImpl carServise = new carServiseImpl();
    List<Car> carList = carServise.listOfCars(count);
    model.addAttribute("cars", carList);
    return "cars";
}

}
