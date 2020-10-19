package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{id}")
    public ResponseEntity<String> hello(@PathVariable("id") String id){
        //helloService.makeException();

        return ResponseEntity.status(400).body("hello" + id);

    }


    @GetMapping("/city/all")
    public ResponseEntity<List<City>> retrieveCity(){

        return ResponseEntity.ok(helloService.retrieveCity());

    }

    @PostMapping("/hello/{id}")
    public ResponseEntity<String> hello1(@PathVariable("id") String id){
        //helloService.makeException();

        return ResponseEntity.status(200).body("hello" + id);


    }


    @GetMapping("/test")
    public void test(){

       //Set<Person> arr = new HashSet<>();
       //arr.add(new Person(1));
       //arr.add(new Person(1));
       //arr.add(new Person(2));
       //arr.add(new Person(3));
       //arr.add(new Person(1));

       //
       //

       //List<String> sArr = arr.stream()
       //        .map(MyInteger::toString)
       //        .peek(System.out::println)
       //        .collect(Collectors.toList());

       //Integer io = Integer.valueOf(1);



       //sArr.forEach(System.out::println);

       //return ResponseEntity.ok().build();

    }


    @DeleteMapping("/demo4")
    public String test4(@RequestParam("id") Integer id,@RequestParam("name") String name) {
        System.out.println("test4......");
        return Integer.valueOf(id) + ":" + name;
    }
    @GetMapping("/{id}")
    public String test5(@PathVariable("id") Integer id) {
        System.out.println("test5....");
        return String.valueOf(id);
    }

    @GetMapping("/hello12")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String userMessage(){
        return helloService.message();
    }


    static class Person {
        public Person(String idCard) {
            this.idCard = idCard;
            this.name1 =String.valueOf(new Random().nextInt());
            this.name2 =String.valueOf(new Random().nextInt());
        }

        String idCard;
        String name1;
        String name2;

        public String getIdCard() {
            return idCard;
        }

        public void setIdCard(String idCard) {
            this.idCard = idCard;
        }

        public String getName1() {
            return name1;
        }

        public void setName1(String name1) {
            this.name1 = name1;
        }

        public String getName2() {
            return name2;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj){
                return true;//地址相等
            }

            if(obj == null){
                return false;//非空性：对于任意非空引用x，x.equals(null)应该返回false。
            }

            if(obj instanceof Person){
                Person other = (Person) obj;
                //需要比较的字段相等，则这两个对象相等
                if(equalsStr(this.idCard, other.idCard)
                ){
                    return true;
                }
            }

            return false;
        }

        private boolean equalsStr(String str1, String str2){
            if(StringUtils.isEmpty(str1) && StringUtils.isEmpty(str2)){
                return true;
            }
            if(!StringUtils.isEmpty(str1) && str1.equals(str2)){
                return true;
            }
            return false;
        }


        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + (idCard == null ? 0 : idCard.hashCode());
            return result;
        }
    }

    public static void main(String[] args) {
            Set<Person> arr = new HashSet<>();
        arr.add(new Person("1"));
        arr.add(new Person("1"));
        arr.add(new Person("2"));
        arr.add(new Person("3"));
        arr.add(new Person("1"));

        arr.stream().map(Person::getIdCard).forEach(System.out::println);


























        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

















        Integer i = 10;
        int b=i;
        Integer a=1;
        System.out.println(a==1?"等于":"不等于");
        Boolean bool=false;
        System.out.println(bool?"真":"假");








        boolean flag = true;
        Integer ii = 0;
        int j = 1;
        int k = flag ? ii : j;
        System.out.println(k);
    }

}
