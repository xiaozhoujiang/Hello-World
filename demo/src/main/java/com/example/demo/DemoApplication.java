package com.example.demo;

import com.example.demo.controller.thread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
	//}

	public static void main(String[] args) {
		thread mTh1=new thread("A");
		thread mTh2=new thread("B");
		mTh1.start();
		mTh2.start();

	}
}

