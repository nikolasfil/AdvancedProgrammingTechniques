package gr.upatras.first;

public class GFG {
	private String name;
	
	public static void main(String[] args) {
		// 		
		GFG myObject = new GFG();
		myObject.setName("LOL");
		
		System.out.println(myObject.getName()+" welcome to GeekForGeeks");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
