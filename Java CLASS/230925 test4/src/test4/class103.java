package test4;

import java.util.Scanner;

public class class103{
public static void main(String[]args){
Scanner s = new Scanner(System.in);

int num1;
System.out.print("정수를 입력하세요 : ");
num1 = s.nextInt();

int num2;
System.out.print("정수를 입력하세요 : ");
num2 = s.nextInt();

int resAdd;
int resSub;
int resMul;
double resDiv;
int rest;

resAdd = num1 + num2;
resSub = num1 - num2;
resMul = num1 * num2;
resDiv = (double) num1 / num2;
rest = num1 % num2;

System.out.println("Add : "+ num1 + "+" + num2 + "=" + resAdd);
System.out.println("Sub : " + num1 + "-" + num2 + "=" + resSub);
System.out.println("Mul : " + num1 + "x" + num2 + "=" + resMul);
System.out.println("Div : " + num1 + "/" + num2 + "=" + resDiv);
System.out.println("Rest : "+ num1 + "%"+ num2 + "=" + rest);

s.close();
 
}
}