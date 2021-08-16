package LinkedList;

public class NodeExample {
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(12);
        Node<Integer> node1 = new Node<>(99);
        Node<Integer> node2 = new Node<>(37);
        
        node.next = node1;
        node1.next = node2; 
        
        System.out.println(node.toString());
        System.out.println(node.next);
        System.out.println(node.next.next);  
        
        Node<String> nodeS = new Node<>("Allen");
        Node<String> nodeS1 = new Node<>("Bob");
        Node<String> nodeS2 = new Node<>("Carrol");
        Node<String> nodeS3 = new Node<>("Debby");
        
        nodeS.next = nodeS1;
        nodeS1.next = nodeS2;
        nodeS2.next = nodeS3; 
        
        nodeS1.next = new Node<>("Brad", nodeS2);
        System.out.println(nodeS1.toString());
        System.out.println(nodeS1.next);
        System.out.println(nodeS1.next.next); 
   }
    
}
