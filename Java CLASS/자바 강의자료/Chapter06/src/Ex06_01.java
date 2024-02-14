public class Ex06_01 {
	public static void main(String[] args) {
		Turtle turtle = new Turtle();	
		int x, y;		
		String[] colors = {"red","green", "magenta", "blue", "black"};
		
		turtle.speed(100);
		turtle.outlineColor("white");
		turtle.setCanvasSize(330, 330);
		turtle.up();
	
		for (int i=0; i<7; i++) {
			for (int k=0; k<7; k++) {
				x = i*50 - 150;
				y = k*50 - 150;
				turtle.setPosition(x, y);
				
				int num = (int)(Math.random()*colors.length);
				turtle.fillColor(colors[num]);
				turtle.stamp();
			}
		}
		
	}
}
