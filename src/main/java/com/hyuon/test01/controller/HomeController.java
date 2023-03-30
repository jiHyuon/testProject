package com.hyuon.test01.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @PostMapping("/pointSave")
    public String pointSave(){

        String st = "apple";
        char[] arr = st.toCharArray();
        int[] list = new int[5];
        List<String> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();


        list1.add(st);
        list1.get(1);

        int i =  Integer.parseInt(list1.get(1));

        list[0] = 5;


        return "/pointSave";
    }


}
