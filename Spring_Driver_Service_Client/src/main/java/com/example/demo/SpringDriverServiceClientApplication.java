package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringDriverServiceClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDriverServiceClientApplication.class, args);
		Client client=ctx.getBean(Client.class);
		System.out.println(client.invokeGetAll());
//		Driver[]list=client.invokeAllAsObject();
//		for(Driver eachDriver:list) {
//			System.out.println("Driver id:"+eachDriver.getId());
//			System.out.println("Driver Name:"+eachDriver.getName());
//			System.out.println("Mobile Number:"+eachDriver.getMobileNumber());
//			System.out.println("Rating:"+eachDriver.getRating());
//		}
//		System.out.println("Added");
//		client.add();
		ctx.close();
	}
//@Bean
//public RestTemplate template() {
//	return new RestTemplate();
//}
	@Bean
	public RestTemplate template() {
		RestTemplate template= new RestTemplate();
		template.getInterceptors().add(interceptor());
		return template;
	}
	
@Bean
public BasicAuthenticationInterceptor interceptor() {
	return new BasicAuthenticationInterceptor("India","India");
}
}
