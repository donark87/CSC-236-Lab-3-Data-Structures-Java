//Donark Patel
//CSC236
//Lab 3B

public interface LinearLinkedList
{
	public void setFirstNode(ListNode fNode);
	public ListNode getFirstNode();
	public void addListNodeFirst(String c, int sec, int credit);
	public void addListNodeLast(String c, int sec, int credit);
	public boolean isEmpty();
	public void remove(String c);
	public String toString();
}