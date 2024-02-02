package com.ohgiraffers.section02.assignment;

public class Application01 {

    public static void main(String[] args) {
        
        /* 수업목표. 대입연산자와 산수 복합 대입 연산자를 이해 */
        /* 필기. 
        *   대입연산자와 산술 복합 대입 연산자.
        *   '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함. 
        *   '+=': 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함.
        *   '-=': 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함.
        *   '*=': 왼쪽의 피연산자에 오른쪽의 피연산자를 곱합 결과를 왼쪽의 피연산자에 대입함.
        *   '/=': 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함.
        *   '%=': 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함.
        *  */
        
        int num=12;
        
        num=num+3; //왼쪽은 공간이고 오른쪽은 값    //15
        System.out.println("num = " + num);
        
        num+=3;  //num=num+3;과 같은 의미이다.    //18
        System.out.println("num = " + num);

        num-=5; //num=num-5                    //13
        System.out.println("num = " + num);

        num*=2; //num=num*2                    //26
        System.out.println("num = " + num);

        num/=2; //num=num/2                    //13
        System.out.println("num = " + num);

        num%=2;                                //1
        System.out.println("num = " + num);

        /*주의사항*/
        /* 필기.
        *   산술 복합 대입 연산자의 작성 순서에 주의해야 한다.
        *   산술 대입 연산자가 아닌 '-5'를 num 변수의 공간에 대입을 한 것이다.
        *  */
        num=-5;
        System.out.println("num = " + num);
        
    }
    
}
