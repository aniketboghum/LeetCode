package LeetCode;

import java.util.ArrayList;

public class MergeKSortedLists_hard
{
    public static ListNode mergeKLists(ListNode[] lists)
    {
        ListNode mergedListHead = new ListNode();
        ListNode currentNode = mergedListHead;
        int minValue = 1000;
        int minIndex = -1;

        while (!areAllListsNull(lists))
        {
            ListNode temp = new ListNode();
            for (int i=0; i<lists.length; i++)
            {
                if (lists[i] == null) continue;
                if ((lists[i].val <= minValue))
                {
                    minValue = lists[i].val;
                    minIndex = i;
                }
            }

            temp.val = minValue;
            minValue = 1000;
            lists[minIndex] = lists[minIndex].next;
            currentNode.next = temp;
            currentNode = currentNode.next;
        }

        return mergedListHead.next;
    }

    public static boolean areAllListsNull(ListNode[] lists)
    {
        int count = 0;
        for (ListNode i : lists)
        {
            if (i == null) count++;
        }
        return count == lists.length;
    }

    public static void main(String[] args)
    {
        int[][] lists = {{1,4,5}, {1,3,4}, {2,6}};
//        int[][] lists = {{}};

        ArrayList<ListNode> listNode = new ArrayList<>();

        for (int[] list : lists)
        {
            ListNode node = ListNode.generateList(list);
            listNode.add(node);
        }

        ListNode[] lis = listNode.toArray(new ListNode[0]);
        ListNode.displayList(mergeKLists(lis));
    }
}
