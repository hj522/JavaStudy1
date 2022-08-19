package Exercise.Interface;

import chapter08.Student;

public abstract class Shape implements Comparable<Shape> {
	
	// 메소드 - 넓이, 둘레
	public abstract double area(); 
	
	public abstract double perimeter();
	
	
	   public int compareTo(Shape o) {
	      if(this.area() < o.area()) {
	         return -1;
	      }else if(this.area() > o.area()) {
	         return 1;
	      }else {
	         return 0;
	      }
   }
}


