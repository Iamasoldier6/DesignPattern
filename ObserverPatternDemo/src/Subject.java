import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<CustomObserver> customObserverList = new ArrayList<>();
	private int mState;

	public int getState() {
		return mState;
	}

	public void setState(int state) {
		mState = state;
		notifyAllObservers();
	}

	public void attach(CustomObserver customObserver) {
		customObserverList.add(customObserver);
	}

	public void notifyAllObservers() {
		for (CustomObserver customObserver : customObserverList) {
			customObserver.update();
		}
	}
	
}
