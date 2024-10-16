package Assignment;

public class Circular_Doubly_Linked {
	Dnode root; 

	void create_list() {
		root = null; 
	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;
			root.left = root.right = root; 
		} else {
			Dnode t = root.left;
			n.right = root; 
			n.left = t; 
			t.right = n; 
			root.left = n; 
			root = n; 
		}
		System.out.println(data + " inserted at left");
	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;
			root.left = root.right = root; 
		} else {
			Dnode t = root.left; 
			n.left = t; 
			n.right = root; 
			t.right = n;
			root.left = n; 
		}
		System.out.println(data + " inserted at right");
	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty List");
		} else if (root.right == root) { 
			System.out.println(root.data + " deleted");
			root = null;
		} else {
			Dnode t = root.left; 
			System.out.println(root.data + " deleted");
			root = root.right;
			root.left = t; 
			t.right = root; 
		}
	}

	void delete_right() {
		if (root == null) {
			System.out.println("Empty List");
		} else if (root.right == root) { 
			System.out.println(root.data + " deleted");
			root = null;
		} else {
			Dnode t = root.left; 
			System.out.println(t.data + " deleted");
			Dnode new_t = t.left; 
			new_t.right = root; 
			root.left = new_t; 
		}
	}

	void print_list() {
		if (root == null) {
			System.out.println("List Empty");
		} else {
			Dnode t = root;
			do {
				System.out.print("<-|" + t.data + "|->");
				t = t.right;
			} while (t != root);
			System.out.println();
		}
	}

	void print_list_reverse() {
		if (root == null) {
			System.out.println("List Empty");
		} else {
			Dnode t = root.left; 
			do {
				System.out.print("<-|" + t.data + "|->");
				t = t.left;
			} while (t != root.left);
			System.out.println();
		}
	}
}
