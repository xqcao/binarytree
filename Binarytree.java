
class Binarytree {
	Node root;
	public void ADD( int date){
		Node newnode = new Node(date);
		if (root == null) {
			root = newnode;
		} else {
			root.ADDNODE(newnode);
		}
	}
	public void PRINT(){
		this.root.printnode();
	}


}

