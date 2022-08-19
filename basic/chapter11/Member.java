package chapter11;

// Value Object (�����͸� �����ϴ� ��ü)
public class Member {
	private String id;
	private String name;
	private int mileage;
	
	public Member(String id, String name, int mileage) {
		this.id = id;
		this.name = name;
		this.mileage = mileage;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member member = (Member) obj;
		
		if(this.id.equals(member.id) && this.name.equals(member.name)) {
			return true;
	}
	return false;
}
}