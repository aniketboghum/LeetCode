package LeetCode;

public class MergeTwoSortedLists_easy
{
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode mergedListHead = new ListNode();
        ListNode currentNode = mergedListHead;

        while (list1 != null && list2 != null)
        {
            if (list1.val < list2.val)
            {
                currentNode.next = list1;
                list1 = list1.next;
            }
            else
            {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        currentNode.next = list1 == null ? list2 : list1;

        return mergedListHead.next;
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,4};
        int[] b = {1,3,4};

        ListNode list1 = ListNode.generateList(a);
        ListNode list2 = ListNode.generateList(b);

        ListNode.displayList(mergeTwoLists(list1, list2));
    }
}
