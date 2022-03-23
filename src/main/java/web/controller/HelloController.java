package web.controller;

import Models.Car;
import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping("/cars")
	public String printCarTable(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model){
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Lexus", "Green", 2020));
		cars.add(new Car("Jeep", "Yellow", 2021));
		cars.add(new Car("Honda", "Black", 2019));
		cars.add(new Car("Audi", "Purple", 2017));
		cars.add(new Car("Lambargini", "Blue", 2022));
		CarServiceImpl carService = new CarServiceImpl();
		cars = CarServiceImpl.carsCount(cars,count);

		model.addAttribute("cars", cars);
		return "cars";
	}
	
}