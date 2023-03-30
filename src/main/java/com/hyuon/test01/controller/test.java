package com.hyuon.test01.controller;

import java.util.ArrayList;
import java.util.List;

public class test {

    public int solution() {
        int answer = 0;
        int[] levels = {1,2,3,4};

        int length = levels.length;
        double size = length*0.25;
        int num = (int)size;

        answer = levels[length-num];


        return answer;
    }

}
