package Exercise;

public class Plane {
 
	// 필드
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	// 생성자
	Plane() {
		numberOfPlanes++;
	}
	
	Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;

	}
	
	// 메소드
	
	public String getManufacture() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	
	public void setManufacture(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers < 0) {
			this.maxNumberOfPassengers = 0;
			return;
		} else {
		  this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
}
