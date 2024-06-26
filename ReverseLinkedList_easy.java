package LeetCode;

public class ReverseLinkedList_easy {
    public static ListNode reverseList(ListNode head) {
        ListNode RevHead = null;

        while (head != null)
        {
            ListNode temp = new ListNode();
            temp.val = head.val;
            temp.next = RevHead;
            RevHead = temp;

            head = head.next;
        }
        return RevHead;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        ListNode head = ListNode.generateList(a);

        ListNode.displayList(reverseList(head));
    }
}
