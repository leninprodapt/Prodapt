class Attendance
{
	String name;
	int id;

	Attendance()
	{
		
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}

	public String toString()
	{
		return name+" "+id; 
	}
}