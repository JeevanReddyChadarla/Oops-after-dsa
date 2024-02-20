package interview;

public class Four {
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode temp=new ListNode(1);
        ListNode head=temp;
        while(list2!=null && list1!=null){
            if(list1.val<list2.val){
                temp.next=list1.next;
                temp=temp.next;
                list1=list1.next;
            }else if(list2.val<list1.val){
                temp.next=list2.next;
                temp=temp.next;
                list2=list2.next;
            }else{
                temp.next=list2.next;
                temp=temp.next;
                list1=list1.next;
                list2=list2.next;
            }
            System.out.println(temp.val);
        }
        while(temp!=null) {
        	System.out.println("hi");
        	System.out.println(temp.val);
        	temp=temp.next;
        }
        return head;
        
    } 

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(9);
		ListNode d = new ListNode(10);
		
		ListNode head1 = new ListNode(3);
		ListNode b1 = new ListNode(4);
		ListNode c1 = new ListNode(6);
		ListNode d1 = new ListNode(7);
		
		
		head.next=a;
		a.next=b;
		b.next=c;
		c.next=d;
		
		head1.next=b1;
		b1.next=c1;
		c1.next=d1;
		
		mergeTwoLists(head, head1);
		
	}

}
