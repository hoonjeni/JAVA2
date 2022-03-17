package tutorial21;

public class Node {
	private int x;
	private int y;
	
	public int getx() {
		return x;
		
	}
	
	public void setX(int x) {
		this.x = y;
		
	}
	
	public int gety() {
		return y;
		
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) { 
		return new Node((this.x + other.getx()) / 2,(this.y + other.gety()) / 2);
		
	}
}


	
