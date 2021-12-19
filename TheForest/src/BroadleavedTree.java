
public class BroadleavedTree extends Trees{

	
	BroadleavedTree(String type, String body, String leaves, String branch, int age){
		this.type = type;
		this.body = body;
		this.leaves = leaves;
		this.branch = branch;
		this.age = age;
		
	}
	
	@Override
	void grow() {
		System.out.println("*This " + this.type + " is growing*");
	
	}

	@Override
	void produceAir() {
		System.out.println("*This " + this.type + " produces air*");
		
	}

	@Override
	void leavesTouch() {
		System.out.println("*Those " + this.leaves + " feels pleasantly*");
		
	}

	@Override
	void aging() {
		System.out.println("This " + this.type + " is " + this.age + " years old");
		
	}

	
	
}
