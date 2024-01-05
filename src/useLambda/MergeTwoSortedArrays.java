package useLambda;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1,new ListNode(3, new ListNode(4,null)));
		ListNode list2 = new ListNode(1,new ListNode(2, new ListNode(4,null)));
		ListNode result = new MergeTwoSortedArrays().mergeTwoLists(list1, list2);
		ListNode start = result;
		while(start!=null) {
			System.out.println(start.val);
			start = start.next;
		}
	}
	
	
	ListNode resultHead;
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode start1 = list1;
		ListNode start2 = list2;
		while (start1 != null && start2 != null) {
			if (start1.val > start2.val) {
				insertNode(new ListNode(start1.val), resultHead);
				start1 = start1.next;
			} else if (start1.val < start2.val) {
				insertNode(new ListNode(start2.val), resultHead);
				start2 = start2.next;
			} else {
				insertNode(new ListNode(start1.val), resultHead);
				insertNode(new ListNode(start2.val), resultHead);
				start1 = start1.next;
				start2 = start2.next;
			}
		}
		while (start1 != null) {
			insertNode(new ListNode(start1.val), resultHead);
			start1 = start1.next;
		}
		while (start2 != null) {
			insertNode(new ListNode(start2.val), resultHead);
			start2 = start2.next;
		}
		return resultHead;
	}

	private void insertNode(ListNode newNode, ListNode resultHead) {
		if(resultHead==null) {
			resultHead = newNode;
		} else {
			resultHead.next = newNode;
		}
	}

}
