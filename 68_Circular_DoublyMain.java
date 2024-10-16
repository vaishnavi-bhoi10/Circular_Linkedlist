package Assignment;

import java.util.Scanner;

public class Circular_DoublyMain {
	public static void main(String args[]) {
		Circular_Doubly_Linked obj = new Circular_Doubly_Linked();
		Scanner in = new Scanner(System.in);
		int ch, e;
		obj.create_list();
		do {
			System.out.println("==============Circular_Doubly_Linked=============");
			System.out.println(
					"\n1.Insert Left:-\n2.Insert Right:-\n3.Delete Left:-\n4.Delete Right:-\n5.Print all Elements:-\n6.Print Reverse:-\n0.Exit:-");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element :");
				e = in.nextInt();
				obj.insert_left(e);
				break;

			case 2:
				System.out.println("Enter element :");
				e = in.nextInt();
				obj.insert_right(e);
				break;

			case 3:
				obj.delete_left();
				break;

			case 4:
				obj.delete_right();
				break;

			case 5:
				obj.print_list();
				break;

			case 6:
				obj.print_list_reverse();
				break;

			case 0:
				System.out.println("Thank You ....");
				break;

			default:
				System.out.println("Wrong option selected please choose");
				break;
			}
		} while (ch != 0);
	}
}
