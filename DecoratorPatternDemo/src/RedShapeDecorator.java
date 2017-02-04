public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		mDecoratedShape.draw();
		setRedBoarder(mDecoratedShape);
	}

	private void setRedBoarder(Shape decoratedShape) {
		System.out.println("Boarder Color: Red");
	}
}
