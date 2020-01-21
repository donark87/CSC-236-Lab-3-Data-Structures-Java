//Donark Patel
//CSC236
//Lab 3B

public class ListNode implements Node
{
	private ListNode link;
	String course;
	int section,
		credits;

	public ListNode()
	{
		this("", 0, 0, null);
	}

	public ListNode(String c,int sec, int credit, ListNode l)
	{
		course = c;
		section = sec;
		credits = credit;
		link = l;
	}

	public void setCourse(String c)
	{
		course = c;
	}

	public void setCredit(int credit)
	{
		credits = credit;
	}

	public void setSection(int sec)
	{
		section = sec;
	}

	public void setNext(ListNode l)
	{
		link = l;
	}

	public String getCourse()
	{
		return course;
	}

	public int getSection()
	{
		return section;
	}

	public int getCredit()
	{
		return credits;
	}

	public ListNode getNext()
	{
		return link;
	}

	public boolean equals(ListNode otherNode)
	{
		if(course == (otherNode.course) && section == (otherNode.section)&& credits == (otherNode.credits))
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
		return("Course: " + getCourse()+
			   " Section: " + getSection()+
			   " Credit: " + getCredit());
	}
}