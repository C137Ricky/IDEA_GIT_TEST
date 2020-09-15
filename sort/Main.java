package sort;

import java.util.Scanner;

 class ListNode{
    public ListNode(){};
    ListNode  next;
    int val;
    public ListNode(int val){
        this.val=val;
    }
}

public class Main {

      public static ListNode reverse(ListNode head){
          if(head==null) return null;
           ListNode pre=null;
           while(head!=null){
               ListNode temp=head.next;
               head.next=pre;
               pre=head;
               head=temp;

           }
           return pre;
       }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        ListNode head=new ListNode(arr[0]);
        ListNode p=head;
        for(int i=1;i<arr.length;i++){
            p.next=new ListNode(arr[i]);
            p=p.next;
        }
        ListNode res=reverse(head);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
        System.out.println(res);

    }

    }



