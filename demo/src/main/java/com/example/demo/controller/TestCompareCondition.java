package com.example.demo.controller;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCompareCondition {

    //public static String reservationDate =
    // ;

    public static void main(String [] args) throws InterruptedException {

        //System.out.println(TestCompareCondition.getLastReservationDate());;
        //getMethod();
        System.out.println(getMethod());
    }

    public static Integer[] getMethod(){
        Integer[] wordList = {1,2,3,4,5,6};
        return  Arrays.stream(wordList).filter(s -> s%2 ==0).toArray(Integer[]::new);
    }



















//    public static String getLastReservationDate() {
//        if (Objects.isNull(TestCompareCondition.reservationDate)) {
//            return null;
//        }
//        return Arrays.stream(reservationDate.split(";"))
//                .map(String::trim)
//                .filter(s -> !s.isEmpty())
//                .max(Comparator.naturalOrder())
//                .orElse(null);
//    }


}

