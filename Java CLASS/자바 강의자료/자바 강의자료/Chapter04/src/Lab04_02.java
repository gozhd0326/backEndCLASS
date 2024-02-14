public class Lab04_02 {
	public static void main(String[] args) {
		String ss = "Java";
		System.out.println("원본 문자열 ==> " + ss);

		String newSS = "";
		newSS = ss.substring(0,1).toLowerCase();
		newSS += ss.substring(1,2).toUpperCase();
		newSS += ss.substring(2,3).toUpperCase();
		newSS += ss.substring(3,4).toUpperCase();
		
		System.out.print("변환 문자열 ==> ");
		System.out.print(newSS);
	}
}
