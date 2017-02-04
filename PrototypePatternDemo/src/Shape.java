public abstract class Shape implements Cloneable {

	private String mId;
	protected String mType;

	abstract void draw();

	public String getType() {
		return mType;
	}

	public String getId() {
		return mId;
	}

	public void setId(String id) {
		this.mId = id;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
