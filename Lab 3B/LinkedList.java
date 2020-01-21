//Donark Patel
//CSC236-63
//Lab 3B

public class LinkedList implements LinearLinkedList
{
	private ListNode firstNode;
	String course;
	int section,
		credits;

	public LinkedList()
	{
		firstNode = null;
	}

	public LinkedList(ListNode fNode)
	{
		firstNode = fNode;
	}

	public void setFirstNode(ListNode fNode)
	{
		firstNode = fNode;
	}

	public ListNode getFirstNode()
	{
		return firstNode;
	}

	public void addListNodeFirst(String c, int sec, int credit)
	{
		if(this.isEmpty())
		{
			setFirstNode(new ListNode(c,sec,credit,null));
		}
		else
		{
			setFirstNode(new ListNode(c,sec,credit,getFirstNode()));
		}
	}

	public void addListNodeLast(String c, int sec, int credit)
	{
		if(this.isEmpty())
		{
			setFirstNode(new ListNode(c,sec,credit,null));
		}
		else
		{
			ListNode current = getFirstNode();
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNext(new ListNode(c,sec,credit,null));
		}
	}

	public boolean isEmpty()
	{
		return getFirstNode() == null;
	}

	public void remove(String c)
	{
		ListNode testNode = new ListNode(c,0,0,null);
		ListNode current = this.getFirstNode();

		if(getFirstNode().course.equals(testNode.course))
		{
			ListNode firstNode = new ListNode();
			firstNode = current.getNext();
			current.setNext(firstNode);
		}
		else if(!(getFirstNode().equals(testNode)))
		{
			do{
				current.getNext();
				if(current.getNext() == null)
				{
					System.out.println("No such course in this Student's scheudle ");
				}
			}while(!(current.course.equals(testNode.course)));

		}
	}

	public String toString()
	{

		ListNode current = this.getFirstNode();

		do{
			return("\n" + current+
				   "\n" + current.getNext());
		}while(current.getNext() != null);
	}
}