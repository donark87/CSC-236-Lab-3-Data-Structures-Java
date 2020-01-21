//Donark Patel
//CSC 236
//Lab 3B

import java.util.Collection;

public class ArrayList implements StudentArray
{
	private Student[] students;
	private int size;

	public ArrayList(int arraySize)
	{
		size = arraySize;
		students = new Student[size];
	}

	public ArrayList(Collection <? extends Student> C)
	{
		size = 0;
		if(C != null)
		{
			for(Student st: C)
			{
				add(0,st);
			}
		}
	}

	public Student get(int index)
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("Index does not exit.");
		}
		else
		{
			return students[index];
		}
	}

	public void add(int index,Student stud)
	{
		if(index  < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("Index does not exit.");
		}
		size++ ;
		students[index] = stud;
	}

	public Student remove(int index)
	{
		int i = index;

		if(i < size || i >= size)
		{
			Student student = students[index];
			students[index] = null;

			while (i < size)
			{
				students[i] = students[i+1];
				students[i+1] = null;
				i++;
			}
			size++;
			return student;
		}
		else
		{
			throw new IndexOutOfBoundsException("Index does not exit.");
		}
	}

	public boolean contains(Student testStudent)
	{
		boolean contain = true;

		for(Student existingStudent: students)
		{
			if(existingStudent.equals(testStudent))
			{
				contain = true;
				break;
			}
			else
			{
				contain = false;
			}
		}

		return contain;
	}

	public void printList()
	{
		for(Student studentList: students)
		{
			System.out.println(studentList);
		}
	}
}