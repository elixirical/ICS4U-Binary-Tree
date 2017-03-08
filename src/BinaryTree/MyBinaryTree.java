package BinaryTree;

public class MyBinaryTree {
	
	StudentInfo root;
	int numItems = 0;
	
	public StudentInfo getRoot() {
		return root;
	}
	
	public void addToTree( StudentInfo itemToAdd, StudentInfo targetRoot ) {
		
		if (numItems == 0) {
			root = itemToAdd;
			numItems++;
		} else if (numItems > 0) {
			if (itemToAdd.getStudentNumber() < targetRoot.getStudentNumber()) {
				if (targetRoot.getLeft() == null) {
					targetRoot.setLeft(itemToAdd);
					numItems++;
				} else if (targetRoot.getLeft() != null) {
					addToTree(itemToAdd, targetRoot.getLeft());
				}
			} else if (itemToAdd.getStudentNumber() > targetRoot.getStudentNumber()) {
				if (targetRoot.getRight() == null) {
					targetRoot.setRight(itemToAdd);
					numItems++;
				} else if (targetRoot.getRight() != null) {
					addToTree(itemToAdd, targetRoot.getRight());
				}
			}
		}
		
		/* if (targetRoot != null) {
			if ( targetRoot.getStudentNumber() < itemToAdd.getStudentNumber() ) {
				addToTree( itemToAdd, targetRoot.getRight() );
			} else if ( targetRoot.getStudentNumber() > itemToAdd.getStudentNumber() ) {
				addToTree( itemToAdd, targetRoot.getLeft() );
			}
		} else if (targetRoot == null) {
			targetRoot = itemToAdd;
			numItems++;
			if (root == null) {
				root = targetRoot;
			}
		} */
	}
	
	public void traverseInorder( StudentInfo targetRoot ) {
		
	}
	
	public void traversePreorder( StudentInfo targetRoot ) {
		
	}

	public void traversePostorder( StudentInfo targetRoot ) {
	
	}

}
