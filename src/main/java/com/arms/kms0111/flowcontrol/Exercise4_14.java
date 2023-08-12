package com.arms.kms0111.flowcontrol;

public class Exercise4_14 {
    public static void main(String[] args) {
            int answer = (int)(Math.random()*100) +1;
            int input = 0; // 사용자입력을 저장할 공간
            int count = 0; // 시도횟수를 세기위한 변수
            java.util.Scanner s = new java.util.Scanner(System.in);

            do {
                count++;
                System.out.print("1 과 100사이의 값을 입력하세요 :");
                input = s.nextInt(); //

                if(!(input > 0 && input <=100))
                    System.out.print("1 과 100사이의 값을 입력하세요 :");

                if(input>answer)
                    System.out.println("더 작은수를 입력하세요");
                else if(input < answer)
                    System.out.println("더 큰수를 입력하세요");
                else{
                    System.out.println("정답입니다");
                    System.out.println(count+"번 시도했습니다");
                    break;
                }

            } while(true); // 무한반복문
        }

}
