package com.arms.kms0111.operator;

public class Exercise3 {
    public static void main(String[] args) {

        char ch = 'A';
        char lowerCase = ch >='A' && ch <= 'Z' ? (char)(ch + 32) : ch;
        System.out.println("ch = " + ch);
        System.out.println("lowerCase = " + lowerCase);
    }
}
