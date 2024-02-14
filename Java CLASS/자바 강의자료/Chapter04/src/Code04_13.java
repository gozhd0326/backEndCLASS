public class Code04_13 {
	public static void main(String[] args) {
	      String str = "   한글   ABCD  efgh  ";
	      String cutStr = "";

	      cutStr = str.trim();
		
	      System.out.println("원 문자열 ==> [" + str + "]");
	      System.out.println("공백제거  ==> [" + cutStr + "]");
	}
}
