import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String mName;
	private String mDept;
	private int mSalary;
	private List<Employee> mSubordinateList;

	public Employee(String name, String dept, int salary) {
		this.mName = name;
		this.mDept = dept;
		this.mSalary = salary;
		mSubordinateList = new ArrayList<>();
	}

	public void add(Employee e) {
		mSubordinateList.add(e);
	}

	public void remove(Employee e) {
		mSubordinateList.remove(e);
	}

	public List<Employee> getSubordinateList() {
		return mSubordinateList;
	}

	public String toString() {
		return ("Employee :[ Name : " + mName + ", dept : " + mDept + ", salary : " + mSalary + " ]");
	}
}
