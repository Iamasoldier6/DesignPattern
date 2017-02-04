public class Rectangle extends Shape {

	public Rectangle() {
		mType = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
