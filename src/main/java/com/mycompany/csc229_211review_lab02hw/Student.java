package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person{
	double gpa = 0.0;
	private String address;

	// supers info to parent class person
	public Student(String name,int age){
		super(name,(short) age);
	}
	
	// gets gpa
	public double getGPA(){
		return gpa;
	}

	// sets gpa
	public void setGPA(double gpa){
		this.gpa = gpa;
	}
	
	@Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
	
	public String toString(Student s){
		return "Student information:" + s.getName() + "," + s.getAge() + "," + s.getGPA();
	}
	

}