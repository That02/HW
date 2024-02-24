package view;

import java.util.Arrays;

import calcualtor.divm;

public class Print_div {
    public static void P_div(String[] args) {
        divm calc = new divm();

        System.out.println(calc.divmass(Arrays.asList(100, 2, 10)));
    }
}