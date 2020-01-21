//Donark Patel
//CSC236
//Lab 3B

public interface Node
{
	public void setCourse(String c);
	public void setCredit(int credit);
	public void setSection(int sec);
	public void setNext(ListNode l);
	public String getCourse();
	public int getSection();
	public int getCredit();
	public ListNode getNext();
	public boolean equals(ListNode otherNode);
	public String toString();
}