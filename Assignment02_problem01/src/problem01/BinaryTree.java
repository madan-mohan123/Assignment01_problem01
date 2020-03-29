package problem01;


public class BinaryTree {
	LeftNodeStack st=new LeftNodeStack();
	TreeNode root;
	public TreeNode getRoot() {
	return root;
	}
	public void insert(int data) {                                                  
		TreeNode node=new TreeNode(data);
		if(root==null) {
			root=node;
		}
		else {
			TreeNode temp=root;
			TreeNode parent=null;
			while(temp!=null) {
				parent=temp;
				if(data<=temp.getData()) {
					temp=temp.getLeft();
				}
					else {
						temp=temp.getRight();
					}
				}
			if(node.getData()<=parent.getData()) {
				parent.setLeft(node);
			}
				else {
					parent.setRight(node);
				}
			}
			
			}
	public void printLeftNode(TreeNode node) {
	int c=0;
		boolean res=true;
		System.out.println("RootNode : "+ node.getData());
		System.out.print("LeftChildrens : ");
		while(res) {
			while(node!=null) {
				st.push(node);
				node=node.getLeft();
				if(node!=null) {
					System.out.print(node.getData() +" ");
				}
				else {
					c=c+1;
				}
			}
			if(st.isEmpty()) {
				res=false;
				break;
			}
			node=st.pop();
			node=node.getRight();
			
		}
		System.out.println();
		System.out.println("NOT HAVE LEFT CHILDREN COUNT: "+ c);
	}
}
