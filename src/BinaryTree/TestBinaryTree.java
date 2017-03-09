package BinaryTree;

public class TestBinaryTree {

	public static void main (String [] args) {
		
		MyBinaryTree tree = new MyBinaryTree();
		
		StudentInfo student;
		/*student = new StudentInfo( 6, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 4, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 9, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 23, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 47, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 16, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 1, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 59, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 69, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 42, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 420, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 12, "A", "A" );
		tree.addToTree( student, tree.getRoot() );*/
		System.out.println("%%%% In Order %%%%");
		tree.traverseInorder(tree.getRoot());
		System.out.println("%%%% Pre-order %%%%");
		tree.traversePreorder(tree.getRoot());
		System.out.println("%%%% Post Order %%%%");
		tree.traversePostorder(tree.getRoot());
	}

}
