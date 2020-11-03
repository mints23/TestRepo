
public class Employee {
	
	public String name;
	public long number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	Employee(String nm,long num){
		this.name=nm;
		this.number=num;
	}
	
}
