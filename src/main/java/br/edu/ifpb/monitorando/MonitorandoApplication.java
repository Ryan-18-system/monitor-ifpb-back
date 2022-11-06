package br.edu.ifpb.monitorando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.edu.ifpb.monitorando"})
public class MonitorandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorandoApplication.class, args);
	}

}
