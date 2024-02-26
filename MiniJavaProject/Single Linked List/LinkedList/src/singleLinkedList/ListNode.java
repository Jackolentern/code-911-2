package singleLinkedList;

public class ListNode {
	private String name;
	private String phoneNum;
	private String email;
	public ListNode link;
	
	public ListNode() {
		this.name = null;
		this.phoneNum = null;
		this.email = null;
		this.link = null;
	}
	
	public ListNode(String name, String phoneNum, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.link = null;
	}
	
	public ListNode(String name, String phoneNum, String email, ListNode link) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.link = link;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ListNode getLink() {
		return link;
	}

	public void setLink(ListNode link) {
		this.link = link;
	}
	
	
}
