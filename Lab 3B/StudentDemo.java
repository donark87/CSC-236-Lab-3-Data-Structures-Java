//Donark Patel
//CSC236
//Lab 3B

import java.util.Scanner;
public class StudentDemo
{
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[]args)
	{
		int choice,
			input,
			i,
			id;
		String course,
			   str;
		int sec,
			credit,
			response,
			selectedID,
			numClasses;

		System.out.println("First we must create a list: ");
		System.out.println("\nEnter the number of students you want to add: ");
		input = keyboard.nextInt();

		ArrayList theArray = new ArrayList(input);
		LinkedList theLinkedList = new LinkedList();

		for(i = 0; i < input; i++)
		{
			System.out.println("Enter Student ID of the Student you would like to add: ");
			id = keyboard.nextInt();
			theArray.add(i,new Student(id));
		}
		for(i = 0; i < input; i++)
		{
			if(i == 0)
			{
				System.out.println("You have added the following students to the list");
			}
			System.out.println(theArray.get(i));
		}

		do{
			System.out.println("\nEnter 1 to insert a student's initial schedule.");
			System.out.println("Enter 2 to add a course.");
			System.out.println("Enter 3 to drop a course.");
			System.out.println("Enter 4 to exit");
			choice = keyboard.nextInt();

		 	if(choice == 1)
			{
				System.out.println("\nEnter 1 to add initial schedule.");
				System.out.println("Enter 0 to finish.");
				response = keyboard.nextInt();

				if(response != 0)
				{
					System.out.println("Enter ID: ");
					selectedID = keyboard.nextInt();
					Student testStudent = new Student(selectedID);

						if(theArray.contains(testStudent))
						{
							System.out.println("How many classed would you like to add?");
							numClasses = keyboard.nextInt();
							for(i = 0; i < numClasses; i++)
							{
								System.out.println("Enter Course");
								str = keyboard.nextLine();
								course = keyboard.nextLine();
								System.out.println("Enter Section");
								sec  = keyboard.nextInt();
								System.out.println("Enter Credit");
								credit = keyboard.nextInt();
								theLinkedList.addListNodeLast(course,sec,credit);
								System.out.println(theLinkedList);
							}
						}
						else
						{
							System.out.println("Invalid student ID:");
							System.out.println("This student is not on the list.\n\n");
						}
						System.out.println("\nStudent "+ selectedID + " is taking the following classes: \n");
						System.out.println(theLinkedList);
						System.out.println();
				};
			}
			else if(choice == 2)
			{
				System.out.println("\nEnter 1 to add a course.");
				System.out.println("Enter 0 to finish.");
				response = keyboard.nextInt();

				if(response != 0)
				{
					System.out.println("Enter ID: ");
					selectedID = keyboard.nextInt();
					Student testStudent = new Student(selectedID);
					LinkedList theLinkedList1 = new LinkedList();

					if(theArray.contains(testStudent))
					{
						System.out.println("Enter Course");
						str = keyboard.nextLine();
						course = keyboard.nextLine();
						System.out.println("Enter Section");
						sec  = keyboard.nextInt();
						System.out.println("Enter Credit");
						credit = keyboard.nextInt();
						theLinkedList1.addListNodeLast(course,sec,credit);
					}
					else
					{
						System.out.println("Invalid student ID:");
						System.out.println("This student is not on the list.\n\n");
					}
					System.out.println("The following classes are added to the Student: "+ selectedID);
					System.out.println(theLinkedList1);
					System.out.println();
				};
			}
			else if(choice == 3)
			{
				System.out.println("\nEnter 1 to drop a course.");
				System.out.println("Enter 0 to finish.");
				response = keyboard.nextInt();

				if(response != 0)
				{
					System.out.println("Enter ID: ");
					selectedID = keyboard.nextInt();
					Student testStudent = new Student(selectedID);

					if(theArray.contains(testStudent))
					{
						System.out.println("Enter Course");
						str = keyboard.nextLine();
						course = keyboard.nextLine();
						theLinkedList.remove(course);
						System.out.println("Class " + course +  " has been dropped from Student "+ selectedID +" schedule.");
						System.out.println();
					}
					else
					{
						System.out.println("Invalid student ID:");
						System.out.println("This student is not on the list.\n\n");
					}
				};
			}
		}while(choice != 4);


	}
}