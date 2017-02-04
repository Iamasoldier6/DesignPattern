public class Circle extends Shape {

	public Circle() {
		mType = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
