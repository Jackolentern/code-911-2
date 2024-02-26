package singleLinkedList;

import java.util.Scanner;

public class LinkedList {
	Scanner in;
	private ListNode head;
	public LinkedList() {
		head = null;
	}
	
	public void insertNode(String name, String phoneNum, String email) {
		//초기화
	    ListNode newNode = new ListNode(name, phoneNum, email); 
	    // 노드가 없는 경우
	    if (head == null) {
	        this.head = newNode;
	    } else {
	    	// 노드가 있는 경우 노드 바로 뒤에 추가
	        ListNode temp = head;
	        while (temp.link != null) temp = temp.link;
	        temp.link = newNode;
	    }
	}
	
	public void deleteNode(String name) {
		// 노드가 존재하지 않는 경우
	    if (head == null) {
	        return;
	    }
	    // 헤드 노드가 삭제할 노드인 경우
	    if (name.equals(head.getName())) {
	        head = head.link;
	        return;
	    }
	    // pre: 이전 노드 temp: 삭제할 노드
	    ListNode pre = head;
	    ListNode temp = head.link;
	    
	    while (temp != null) {
	        if (name.equals(temp.getName())) {
	            pre.link = temp.link;
	            return;
	        }
	        pre = temp;
	        temp = temp.link;
	    }
	}
	
	public void printNode() {
	    ListNode temp = this.head;
	    
	    while (temp != null) {
	        System.out.print("(");
	        System.out.print("이름: " + temp.getName());
	        System.out.print(", 전화번호: " + temp.getPhoneNum());
	        System.out.print(", 이메일: " + temp.getEmail());
	        System.out.println(")");
	        temp = temp.link;
	    }
	}
}
