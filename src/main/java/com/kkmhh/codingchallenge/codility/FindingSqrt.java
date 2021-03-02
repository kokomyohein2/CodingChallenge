/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kkmhh.codingchallenge.codility;

/**
 *
 * @author KoKo
 */
public class FindingSqrt {

    public static void main(String[] args) {
        System.out.println(solution(1000, 2000));
    }

    public static int solution(int A, int B) {
        // write your code in Java SE 8
//        int sqr = B;

        int res = 0;
        while (B > 1) {
            res = B;
            B = (int) Math.sqrt(B);
            System.out.println("sqr : " + B);
        }
        return res;
    }

}
