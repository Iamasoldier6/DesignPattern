public class VisitorPatternDemo {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
