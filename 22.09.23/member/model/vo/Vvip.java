package member.model.vo;

public class Vvip {

	private String name;
	private String grade;
	private int point;
	
	
	public Vvip() {}
	
	public Vvip(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public double getPoints() {
		return getPoint() * 0.02;
	}
	
	
	public String vvipInfo() {
		return name + "		" + grade + "		  "+ point + "	     " + getPoints();
	}
}
