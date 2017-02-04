public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int mLevel;

	// 责任链中的下一个元素
	protected AbstractLogger mNextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.mNextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.mLevel <= level) {
			write(message);
		}

		if (mNextLogger != null) {
			mNextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}
