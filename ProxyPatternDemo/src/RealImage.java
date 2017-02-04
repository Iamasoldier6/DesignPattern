public class RealImage implements Image {

	private String mFileName;

	public RealImage(String fileName) {
		this.mFileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + mFileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}
