package BinaryTree;

public class TestBinaryTree {

	public static void main (String [] args) {
		
		MyBinaryTree tree = new MyBinaryTree();
		
		StudentInfo student;
		student = new StudentInfo( 8, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 6, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 4, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 2, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 1, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 3, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 5, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 7, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 9, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 12, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 10, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		student = new StudentInfo( 11, "A", "A" );
		tree.addToTree( student, tree.getRoot() );
		tree.traversePostorder(tree.getRoot());
		System.out.println("%%%%%%%%%");
		tree.traversePreorder(tree.getRoot());
		System.out.println("%%%%%%%%%");
		tree.traverseInorder(tree.getRoot());
	}

}
