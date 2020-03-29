package problem01;


public class LeftNodeStack {
	Node top;                                       
	public class Node{
		private TreeNode data;                      
		private Node next;                                        
		Node(TreeNode data){
			this.data=data;
		}
	}
	public boolean push(TreeNode data) {
		Node n=new Node(data);
		n.next=top;
		top=n;
	
		return true ;
	}
	public TreeNode pop() {
		TreeNode n=null;
		if(top!=null) {
			n=top.data;
			top=top.next;
		}
		return n;	
	}
	public boolean isEmpty() {
		
		if(top==null) {
			return true;
		}
		else
			return false;
	}
	
}
