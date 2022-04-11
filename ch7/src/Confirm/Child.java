package Confirm;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		//this.name = name; 
		//- name 필드는 현재 클래스의 있는 필드가 아니므로, super클래스인 Parent클래스를 거쳐야 함.
		super(name);
		this.studentNo = studentNo;
	}
}
