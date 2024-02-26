package singleLinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertNode("홍길동","010-1234-5678","hong.com");
		linkedList.insertNode("이순신","010-1234-5678","lee.com");
		linkedList.insertNode("김유신","010-1234-5678","kim.com");
		linkedList.insertNode("강감찬","010-1234-5678","gang.com");
		linkedList.printNode();
		System.out.println();
		// 중간 노드 삭제
		linkedList.deleteNode("김유신");
		linkedList.printNode();
		System.out.println();
		// 마지막 노드 삭제
		linkedList.deleteNode("강감찬");
		linkedList.printNode();
		System.out.println();
		// 처음 노드 삭제
		linkedList.deleteNode("홍길동");
		linkedList.printNode();
		System.out.println();
	}
}
