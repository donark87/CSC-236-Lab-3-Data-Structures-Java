//Donark Patel
//CSC236
//Lab 3B

public interface StudentArray
{
	public Student get(int index);
	public void add(int index,Student stud);
	public Student remove(int index);
	public boolean contains(Student testStudent);
	public void printList();
}