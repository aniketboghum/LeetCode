package LeetCode;

public class RemoveNthNodeFromEndOfList_medium {
    public static int lengthofList(ListNode head){
        int count = 0;
        while(head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (lengthofList(head) == 1) return null;
        if (lengthofList(head) == n) return head.next;
        int deletionPos = lengthofList(head)-n;
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
//        int[] a = {1,2,3,4,5};
        int[] a = {1, 2};
        ListNode head = AddTwoNumber_medium.makeList(a);
        AddTwoNumber_medium.displayList(removeNthFromEnd(head, 2));
    }
}
