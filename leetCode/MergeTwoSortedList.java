

public class MergeTwoSortedList {
     
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null && l2!=null){
            //Merge List
            if(l1.val <= l2.val) {
                curr.next = l1;
                l1=l1.next;
            }
            else{
                curr.next = l2;
                l2=l2.next;
            }
            curr= curr.next;
        }
        curr.next= l1!=null ? l1 : l2;
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
