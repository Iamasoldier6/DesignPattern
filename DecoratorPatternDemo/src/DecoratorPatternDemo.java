public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("Circle with normal boarder");
		circle.draw();
		System.out.println("\nCircle with red boarder");
		redCircle.draw();
		System.out.println("\nRectangle with red boarder");
		redRectangle.draw();
	}
}
