package practice1017;

class Cafe{
	String name = "나이트로 바닐라 크림";
	String size = "Tall";
	int kcal = 80;
	int fat = 2;
	int protein = 1;
	int sodium = 40;
	int saccharides = 10;
	int caffeine = 232;
	
}

public class Coffee {
public static void main(String[]args) {
	Cafe star = new Cafe();
	
	System.out.println("음료명 : "+star.name);
	System.out.println("사이즈 : "+star.kcal);
	System.out.println("포화지방 :"+star.fat);
	System.out.println("단백질 : "+star.protein);
	System.out.println("나트륨 : "+star.sodium);
	System.out.println("당류 : "+star.saccharides);
	System.out.println("카페인 : "+star.caffeine);
	
	star.caffeine = 0;
	System.out.println("디카페인으로 변경 : "+star.caffeine);
	
}
}
