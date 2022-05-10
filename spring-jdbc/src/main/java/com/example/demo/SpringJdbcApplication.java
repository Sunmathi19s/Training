package com.example.demo;


import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		

		ApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		
		
		Product jamun = ctx.getBean(Product.class);
		
		//System.out.println("Row Added :="+repo.add(jamun));
		
		repo.findAll().forEach(System.out::println);
		Optional<Product> prd = repo.findById(95);
		if(prd.isPresent()) {
			System.out.println(prd.get());
		}else {
			System.out.println("hii varala");
		}
		
	//	System.out.println("find Id :="+repo.findById(99));
		
	//	System.out.println("delete :="+repo.remove(92));
		
	//	Product laddu = ctx.getBean(Product.class);
	//	System.out.println("Update :="+repo.Update(laddu));
	}
	
	@Bean
	public Product jamun()
	{
		return new Product(99,"ja jamun",050);
	}
	
	
	@Bean
	@Primary
	public Product laddu() {
		return new Product(99," special mixture",94);
	}
	
}
