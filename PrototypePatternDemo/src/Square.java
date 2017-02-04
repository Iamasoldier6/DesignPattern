public class Square extends Shape {

	public Square() {
		mType = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
