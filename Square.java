
public class Square {
	private int Side;
	public int area;
	public Square() {
		Side=0;
	}
	 public Square(int Side) {
		 this.Side= Side;
		
	 }
	 public int getSide() {
		 return Side;
	 }
	 public void setSide(int Side){
		 this.Side=Side;
	 }
	 public void area(){
		 double area = Side*Side;
		 System.out.println(area);
		 
	 }
	
	}
	

	
