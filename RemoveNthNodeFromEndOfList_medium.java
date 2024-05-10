package LeetCode;

public class RemoveNthNodeFromEndOfList_medium {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (ListNode.getLengthOfList(head) == 1) return null;
        if (ListNode.getLengthOfList(head) == n) return head.next;
        int deletionPos = ListNode.getLengthOfList(head)-n;
        int count = 0;
        ListNode prev = null;
        ListNode cur = head;

        while (count != deletionPos)
        {
            prev = cur;
            cur = cur.next;

            count++;
        }
        prev.next = cur.next;
        return head;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
//        int[] a = {1, 2};
        ListNode head = ListNode.generateList(a);
        ListNode.displayList(removeNthFromEnd(head, 2));
    }
}
