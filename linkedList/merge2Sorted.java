package linkedList;

public class merge2Sorted {

//	public static ListNode mergeTwoLists(ListNode l1,ListNode l2)
//{
//     if(l1==null) return l2;
//     if(l2==null) return l1;
//     ListNode head=null,tail=null;
//     if(l1.data <=l2.data) {
//    	 head=tail=l1;
//    	 l1=l1.next;
//     }else {
//    	 head=tail=l2;
//    	 l2=l2.next;
//     }
//     
//     while(l1!=null && l2!=null) {
//    	 if(l1.data<=l2.data) {
//    		 tail.next=l1;
//    		 tail=l1;
//    		 l1=l1.next;
//    	 }else {
//    		 tail.next=l2;
//    		 tail=l2;
//    		 l2=l2.next;
//    	 }
//     }
//     if(l1==null)
//    	 tail.next=l2;
//     else
//    	 tail.next=l1;
//     
//     return head;
//
//}

// A utility function to print linked list
static void printList(ListNode node)
{
//while (node != null) {
//System.out.print(node.data + " ");
//node = node.next;
//}
	ListNode temp=node;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}

// Driver code
public static void main(String[] args)
{
ListNode head1 = new ListNode(1);
head1.next = new ListNode(3);
head1.next.next = new ListNode(5);

// 1->3->5 LinkedList created
ListNode head2 = new ListNode(0);
head2.next = new ListNode(2);
head2.next.next = new ListNode(4);

// 0->2->4 LinkedList created
//ListNode mergedhead = mergeTwoLists(head1, head2);

//printList(mergedhead);
printList(head1);
//printList(head2);
System.out.println(head1.data);
}
}
