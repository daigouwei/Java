public class Test13
{
    public static void main(String[] args)
    {
        LinkList<Integer> ll = new LinkList<Integer>();
        ll.insert(ll.head, 1);
        ll.insert(ll.head, 2);
        ll.insert(ll.head.next, 3);
        ll.insert(ll.head.next.next, 4);
        ll.insert(ll.head.next.next.next, 5);
        ll.insert(ll.head.next.next.next.next, 6);
        ll.printLinkList(ll.head);
        System.out.println("------------------------");
        ll.removeNode(ll.head, ll.head.next.next);
        ll.removeNode(ll.head, ll.head.next.next);
        ll.removeNode(ll.head, ll.head);
        ll.removeNode(ll.head, ll.head.next.next);
        ll.printLinkList(ll.head);
    }
}

class LinkList<T>
{
    public Node<T> head = null;

    public class Node<T>
    {
        T data;
        Node<T> next;
    }

    public void insert(Node<T> node, T val)
    {
        Node<T> curr = node;
        if(curr == null)
        {
            curr = new Node<T>();
            curr.data = val;
            curr.next = null;
            head = curr;
        }
        else
        {
            curr.next = new Node<T>();
            curr.next.data = val;
            curr.next.next = null;
        }
    }

    public void removeNode(Node<T> head, Node<T> node)
    {
        if(head == null)
        {
            System.out.println("empty...");
            return;
        }
        else if(head.next == null)
        {
            head = null;
            System.out.println("one node...");
            return;
        }
        else if(node.next != null)
        {
            node.data = node.next.data;
            node.next = node.next.next;
        }
        else
        {
            Node<T> curr = head, prev = null;
            while(curr != null)
            {
                if(curr == node)
                    break;
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
    }

    public void printLinkList(Node<T> head)
    {
        if(head == null)
        {
            System.out.println("empty....");
            return;
        }

        Node<T> curr = head;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
