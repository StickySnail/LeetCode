import java.util.List;

// Definition for singly-linked list.


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode node = new ListNode();
        ListNode ans = new ListNode(333, node);


        while (list1 != null && list2 != null) {

            if (list1.val >= list2.val) {
                node.next = list2;
                list2 = list2.next;
            } else {
                node.next = list1;
                list1 = list1.next;
            }
            node = node.next;
        }

        if(list1 == null && list2 != null) node.next = list2;
        else if(list1 != null && list2 == null) node.next = list1;
        
        return ans.next.next;
    }
}