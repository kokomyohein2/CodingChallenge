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
public class FindingPositionInSequence {

    public static void main(String[] args) {
        System.out.println(solution(12, 124586));
    }

    public static int solution(int A, int B) {
        // write your code in Java SE 8
        String stringA = String.valueOf(A);
        String stringB = String.valueOf(B);
        if (stringB.contains(stringA)) {
            for (int i = 0; i < stringB.length() / 2; i++) {
                int pos = i * 2;
                System.out.println("pos : " + pos);
                System.out.println("val : " + stringB.subSequence(pos, pos + 2));
                if (stringB.subSequence(pos, pos + 2).equals(stringA)) {
                    return i * 2;
                }
            }
        }
        return -1;

    }

}
