package com.zayyni.SBAutowiringApp;

import com.zayyni.SBAutowiringApp.beans.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt= SpringApplication.run(Application.class, args);
		Car car=ctxt.getBean(Car.class);
		car.drive();
	}

}
