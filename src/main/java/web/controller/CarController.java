package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        model.addAttribute(new ArrayList<>(Arrays.asList(
                new Car("BMW", 6),
                new Car("BMW", 5),
                new Car("BMW", 3),
                new Car("Mercedes-Benz", 600),
                new Car("Mercedes-Benz", 500)
        )));
        return "cars";
    }

}