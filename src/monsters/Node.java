package monsters;

public class Node {
    Monster monster;
    Node next;

    public static Node create (Monster monstre, Node noeud) {
        Node NewNode = new Node();
        NewNode.monster = monstre;
        NewNode.next = noeud;
        return NewNode;
    }
}


