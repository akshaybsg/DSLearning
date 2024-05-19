package com.akshayLocal.programs.LinkedList;

class LinkedListSolution {

    public static void main(String args[]) {

        LinkedListSolution solution = new LinkedListSolution();

        ListNode listNode4 = new ListNode(4,null);
        ListNode listNode3 = new ListNode(5,listNode4);
        ListNode listNode2 = new ListNode(3,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        ListNode listNode0 = new ListNode(2,listNode1);

        ListNode listNode44 = new ListNode(4,null);
        ListNode listNode33 = new ListNode(5,listNode44);
        ListNode listNode22 = new ListNode(3,listNode33);
        ListNode listNode11 = new ListNode(1,listNode22);
        ListNode listNode00 = new ListNode(2,listNode11);

        solution.addTwoNumbers(listNode0,listNode00);

    }

    public void addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sum = new ListNode();
        System.out.println(l1);
        System.out.println(l2);

        while(l1!=null || l1.next!=null) {

            if(l2.next!=null) {

                sum.val = l1.val + l2.val;
            }
        }
        System.out.println(sum.val);
    }
}