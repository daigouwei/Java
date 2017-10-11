import java.util.Stack;
public class Test05
{
    public static void main(String[] args)
    {
        LinkList<Integer> ll = new LinkList<Integer>();
        ll.insert(ll.head, 1);
        ll.insert(ll.head, 2);
        ll.insert(ll.head.next, 3);
        ll.insert(ll.head.next.next, 4);
        ll.printStackReverse(ll.head);
        ll.printRecursionReverse(ll.head);
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
        if(node == null)
        {
            node = new Node<T>();
            node.data = val;
            node.next = null;
            head = node;
        }
        else
        {
            node.next = new Node<T>();
            node.next.data = val;
            node.next.next = null;
        }
    }

    public void printStackReverse(Node<T> head)
    {
        if(head == null)
        {
            System.out.println("empty..");
            return;
        }

        Node<T> curr = head;
        Stack<T> stack = new Stack<T>();
        while(curr != null)
        {
            stack.push(curr.data);
            curr = curr.next;
        }
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

    public void printRecursionReverse(Node<T> head)
    {
        Node<T> curr = head;
        if(curr != null)
        {
            printRecursionReverse(curr.next);
            System.out.print(curr.data+" ");
        }
        System.out.println();
    }
}


