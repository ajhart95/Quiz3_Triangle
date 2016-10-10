package Shape.Triangle;

public enum InvalidTriangle {
	ShortSide(){
		public String toString(){
			return "Given sides do not make a valid triangle.";
		}
	}
}
