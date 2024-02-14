package practice1017;



public class CarExample {
public static void main(String[]args) {
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed = 0;
	
	System.out.println("제작회사 : " + company);
	System.out.println("모델명 : "+model);
	System.out.println("색깔 : "+color);
	System.out.println("최고속도 : "+maxSpeed);
	System.out.println("현재속도 : "+speed);
	
	speed = 60;
	System.out.println("수정된 속도 : "+speed);
}
}
