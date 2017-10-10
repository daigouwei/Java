/**
 *
 */

public class LinkListTest
{
    public static void main(String[] args)
    {
        LinkList<Integer> ll = new LinkList<Integer>();
        ll.insert(ll.getHead(), 1);
        ll.insert(ll.getHead(), 2);
        ll.insert(ll.getHead(), 3);
        ll.insert(ll.getHead(), 4);
        ll.insert(ll.getHead(), 5);
        ll.insert(ll.getHead(), 6);
        ll.printLinkNode(ll.getHead());
        ll.reverse(ll.getHead());
        ll.printLinkNode(ll.getHead());
    }
}

class LinkList<T>
{
    private Node<T> head;

    LinkList(){head = null;}

    private static class Node<T>
    {
        T data;
        Node<T> next;
        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node<T> getHead()
    {
        return head;
    }

    public void insert(Node<T> node, T point)
    {
        if(head == null)
        {
            head = new Node<T>(point);
            head.next = null;
        }
        else
        {
            Node<T> newNode = new Node<T>(point);
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public void delete(Node<T> node, T point)
    {
        Node<T> curr = head, prev = null;
        boolean removeFlag = false;
        while(curr != null)
        {
            if(curr.data.equals(point))
            {
                if(curr == head)
                {
                    head = curr.next;
                    removeFlag = true;
                    break;
                }
                else if(curr.next == null)
                {
                    prev.next = null;
                    removeFlag = true;
                    break;
                }
                else
                {
                    prev.next = curr.next;
                    removeFlag = true;
                    break;
                }
            }
            prev = curr;
            curr = curr.next;
        }
        if(removeFlag == false)
        {
            System.out.println("no this data.");
        }
    }

    public void reverse(Node<T> node)
    {
        Node<T> curr = node, prev = null, tmp = null;
        while(curr != null)
        {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        head = prev;
    }

    public void printLinkNode(Node<T> node)
    {
        if(node != null)
        {
            while(node != null)
            {
                System.out.println(node.data);
                node = node.next;
            }
        }
        else
        {
            System.out.println("This is a empty list.");
        }
    }
}


