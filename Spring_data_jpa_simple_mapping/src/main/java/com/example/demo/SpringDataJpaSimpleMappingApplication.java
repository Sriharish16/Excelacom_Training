package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.DoctorService;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
	Doctor siva=ctx.getBean(Doctor.class);
	DoctorService service=ctx.getBean(DoctorService.class);
	
//	service.findAll().forEach(System.out::println);
	
//	Doctor added=service.add(siva);
//	if(added!=null) {
//		System.out.println("One Doctor Added");
//	}
	
	//service.findByDepart("Dentist").forEach(System.out::println);
	//service.findByDoctorAndDepart("Sriharish", "Dentist").forEach(System.out::println);
    //service.findByNameOrDept("Varun", "ent").forEach(System.out::println);
	//System.out.println(service.findByDoctorName("Sriharish"));
	ctx.close();
	}
	@Bean
	public Doctor Siva() {
		return new Doctor(201,"Varun","Cardio",1234567890);
		
	}
	

}
