/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public int pairSum(ListNode head) {
        ListNode first = head;

        // to get the number of nodes
        int cnt = 0;
        while(first != null){
            cnt++;
            first = first.next;
        }
     

        ArrayList<Integer>  num = new ArrayList<>();
        ListNode second = head;

        for(int i =0; i<cnt; i++){

            if(i < cnt/2)
                num.add(second.val);
            else
                num.set(cnt - i - 1, num.get(cnt - i -1)+ second.val);

            second = second.next;
        }

        return Collections.max(num);

    }
}   