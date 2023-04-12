package ru.jgauss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication // одна аннотация для конфигурирования всего, содержит дофига аннотаций, например @ComponentScan, @Configuration
//сканирование компонентов cо стереотипными аннотациями (напр. @Component, @Repository, @Service) происходит автоматически в папке, где находится данный класс
//SpringAlishevApp20Application и рекурсивно на всех нижележащих уровнях
//Соответственно, чтобы всё работало ОК, данный класс SpringAlishevApp20Application должен лежать в ru.jgauss, а остальные классы на одном уровне с ним или на
//нижележащих уровнях
public class SpringAlishevApp20Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAlishevApp20Application.class, args);
	}

}
