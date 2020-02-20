package com.farmeter.kozel;

import java.util.List;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

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
	SampleData sampleData;

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
		sampleData.doSample();
	}

	@Override
	public void run(String... args) {
		sampleData.doSample();
	}

}
