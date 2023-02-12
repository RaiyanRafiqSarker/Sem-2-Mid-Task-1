public class Student
{
	private String Name;
	private String id;
	private String Department;
	private double cgpa;
	
	public Student()
	{
		
	}
	public Student (String N,String i, String d, double c)
	{
		Name=N;
		id=i;
		Department=d;
		cgpa=c;
	}
	public void setName(String n)
	{
		Name=n;
	}
	public void setid (String i)
	{
		id=i;
	}
	public void setDepartment (String d)
	{
		Department=d;
	}
	public void setcgpa (double c)
	{
		cgpa=c;
	}
	public String getName()
	{
		return Name;
	}
	public String getid()
	{
		return id;
	}
	public String getDepartment()
	{
		return Department;
	}
	public double getcgpa()
	{
		return cgpa;
	}
	public void display()
	{
		System.out.println(Name);
		System.out.println(id);
		System.out.println(Department);
		System.out.println(cgpa);
	}
}
		