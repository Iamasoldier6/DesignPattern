public class ProxyImage implements Image {

	private RealImage mRealImage;
	private String mFileName;

	public ProxyImage(String fileName) {
		this.mFileName = fileName;
	}

	@Override
	public void display() {
		if (mRealImage == null) {
			mRealImage = new RealImage(mFileName);
		}
		mRealImage.display();
	}
}
