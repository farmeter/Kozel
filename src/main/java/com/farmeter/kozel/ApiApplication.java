package com.farmeter.kozel;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

import com.farmeter.kozel.config.SampleData;

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
