//Donark Patel
//CSC236
//Lab 3B

public class Student implements StudentID
{
	int id;

	public Student()
	{
		this(0);
	}

	public Student(int iD)
	{
		id = iD;

	}

	public void setID(int iD)
	{
		id = iD;
	}

	public int getID()
	{
		return id;
	}

	public boolean equals(Student otherStudent)
	{
		if(id == (otherStudent.id))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{

		return("Student ID: " + getID() );
	}
}