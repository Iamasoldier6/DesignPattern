public abstract class ShapeDecorator implements Shape {

	protected Shape mDecoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.mDecoratedShape = decoratedShape;
	}

	public void draw() {
		mDecoratedShape.draw();
	}
}
