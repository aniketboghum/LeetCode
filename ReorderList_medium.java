package LeetCode;

public class ReorderList_medium {
    public static void reorderList(ListNode head)
    {
        int length = ListNode.getLengthOfList(head);

        ListNode firstHalf  = new ListNode();
        ListNode currentNode = firstHalf;
        ListNode secondHalf = null;

        int i =0;
        while (i < length/2 && head != null)
        {
            currentNode = head;
            currentNode.next = null;
            firstHalf.next = currentNode;

            head = head.next;
            i++;
        }

        firstHalf = firstHalf.next;
        secondHalf = head;
        ListNode.displayList(firstHalf);
        System.out.println();
        ListNode.displayList(secondHalf);

        while (firstHalf != null && secondHalf != null)
        {

        }
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        ListNode head = ListNode.generateList(a);

        reorderList(head);
    }
}
