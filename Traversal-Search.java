import java.io.BufferedReader;
import java.io.InputStreamReader;

class TraversalSearch { 
 private Node root; 
    //Basic Node definition. Each Node contains a Value, a left child, and a right child
    class Node { 
        int val; 
        Node left, right; 
  
        public Node(int value) { 
         val = value; 
         left =null;
         right = null; 
        } 
    } 
  
    public TraversalSearch(int rootValue) {  
        root = new Node(rootValue);  
    } 

    //insert Value into the appropriate spot in the tree
    private Node insert(Node root,int value) { 

        if (root == null) { 
            root = new Node(value); 
            return root; 
        } 
  
        if (value < root.val) 
            root.left = insert(root.left, value); 
        else if (value > root.val) 
            root.right = insert(root.right, value); 
  
        return root; 
    } 
    
    //finish code to print all values with an inorder traversal
    void inorderTraversal(Node root) { 
      
        if (root == null) 
           return; 
           inorderTraversal(root.left); 
           System.out.print(root.val + " "); 
           inorderTraversal(root.right);  
    } 
  
    void postorderTraversal(Node root) {
      
       if (root == null) 
          return;  
          postorderTraversal(root.left); 
          postorderTraversal(root.right); 
          System.out.print(root.val + " "); 
    } 
    
    void preorderTraversal(Node root) { 
      
       if (root == null) 
          return; 
          System.out.print(root.val + " "); 
          preorderTraversal(root.left); 
          preorderTraversal(root.right); 
    } 
    
    private void search(Node root, int key){
      // if value is not present in the tree
      if (root == null){
        System.out.println("False");
        return;
      }

      // if value is found
      if (root.val == key){
        System.out.println("True");
        return;
      }

      // if given value is less than the root node, recurse for left subtree
      // else recurse for right subtree

      if (key < root.val) {
        search(root.left, key);
      }
      else {
        search(root.right, key);
      }
   }
   
    public static void main(String[] args) throws Exception {
      TraversalSearch tree = new TraversalSearch(5);   
      
        tree.insert(tree.root,2); 
        tree.insert(tree.root,7); 
        tree.insert(tree.root,10); 
        tree.insert(tree.root,4); 
        tree.insert(tree.root,1);
     
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Search Tree: ");
        String input = reader.readLine();
        int number = Integer.parseInt(input);
        
        tree.search(tree.root, number);
        System.out.println("");
        
        //start traversal at root
        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(tree.root); 
        System.out.print("\nPostorder traversal: ");
        tree.postorderTraversal(tree.root); 
        System.out.print("\nPreorder traversal: ");
        tree.preorderTraversal(tree.root);
        
        reader.close();
    }
}
