package orderedlinkedlist;

public class Node {
	
	private String item;
	private Node link;
	
	public Node() {
		link = null;
		item = null;
	}
	
	public Node(String newItem) {
		setItem(newItem);
		link = null;
	}
	
	public Node(String newItem, Node linkValue) {
		setItem(newItem);
		link = linkValue;
	}
	
	public void setItem(String newItem) {
		item = newItem;
	}
	
	public void setLink(Node newLink) {
		link = newLink;
	}

	public String getItem() {
		return item;
	}

	public Node getLink() {
		return link;
	}
	
	
}
