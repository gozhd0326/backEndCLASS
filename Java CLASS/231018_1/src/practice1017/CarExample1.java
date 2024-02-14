package practice1017;

class Car1{
	String company = "기아자동차";
	String model = "K9";
	String color = "하얀색";
	int maxSpeed = 350;
	int speed = 0;
	
}


public class CarExample1 {
public static void main(String[]args) {

	Car1 myCar = new Car1();
	
	System.out.println("제작회사 : "+myCar.company);
	System.out.println("모델명 : "+myCar.model);
	System.out.println("색상 : "+myCar.color);
	System.out.println("최고속도 : "+myCar.maxSpeed);
	System.out.println("현재속도 : "+myCar.speed);
	
	myCar.speed = 80;
	System.out.println("수정된 속도 : "+myCar.speed);

}
}
