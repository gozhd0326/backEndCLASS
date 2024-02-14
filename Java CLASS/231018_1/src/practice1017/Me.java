package practice1017;

class About{
	String name = "HJ";
	String gender = "women";
	int age = 25;
	double birth = 3.26;
	String bloodType;
}

public class Me {
public static void main(String[]args) {
	About produce = new About();
	
	System.out.println("이름 : " + produce.name);
	System.out.println("성별 : "+ produce.gender);
	System.out.println("나이 : "+produce.age);
	System.out.println("생일 : "+produce.birth);

	produce.bloodType = "B";
	System.out.println("혈액형 : " +produce.bloodType);
}
}