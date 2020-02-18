package com.farmeter.kozel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import com.farmeter.kozel.entity.Product;
import com.farmeter.kozel.repository.ProductRepository;
import com.farmeter.kozel.util.CommonUtils;

@SpringBootApplication
@Slf4j
public class ApiApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) {
		addSampleData();
		viewSampleData();
	}

	private void addSampleData() {
		log.info("============== addSampleData");

		productRepository.save(Product.builder().name("productName1").build());
		productRepository.save(Product.builder().name("productName2").build());
		productRepository.save(Product.builder().name("productName3").build());
	}

	private void viewSampleData() {
		log.info("============== viewSampleData");

		List<Product> products = productRepository.findAll();
		log.info("{}", CommonUtils.toJson(products));
	}

}
