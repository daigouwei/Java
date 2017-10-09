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


