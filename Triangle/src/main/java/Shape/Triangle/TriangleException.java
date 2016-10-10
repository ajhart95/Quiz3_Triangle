package Shape.Triangle;

public class TriangleException extends Exception {
	private Triangle t;
	public TriangleException(String message){
		super(message);
		this.t = t;
	}
}
