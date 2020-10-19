package com.example.demo.service;


import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class HelloService {

    @Autowired
    private CityRepository cityRepository;
    @Value("${user_name}")
    private String name;
    @Value("${user_age}")
    private String age;
    @Value("${user_sex}")
    private String sex;

    public List<City> retrieveCity(){
        return cityRepository.findAll();
    }

    public String makeException(){
        int a = 0;
        return String.valueOf(3 / a);

    }

    public String message(){


        return "姓名"+getName()+"性别"+getSex()+"年龄"+getAge();
    }
}
