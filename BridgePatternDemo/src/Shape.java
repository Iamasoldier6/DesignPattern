public abstract class Shape {
	protected DrawAPI mDrawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.mDrawAPI = drawAPI;
	}

	public abstract void draw();
}
