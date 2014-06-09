class Node{
		Comparable date;
		Node left;
		Node right;
		
		public Node(int date){
			this.date = date;
		}
		public void ADDNODE(Node newnode) {
			if(newnode.date.compareTo(this.date) < 0){
				if(this.left == null) {
					this.left = newnode;
				} else{
					this.left.ADDNODE(newnode);
				}
			}
			if(newnode.date.compareTo(this.date) >= 0){
				if(this.right == null) {
					this.right = newnode;
				} else{
					this.right.ADDNODE(newnode);
				}
			}
		}
		public void printnode(){
			if(this.left != null) {
				this.left.printnode();
			}
			System.out.print(this.date + ",  ");
			if(this.right != null) {
				this.right.printnode();
			}
		}

		
	}
