import java.util.ArrayList;

public class Assignment2 {
 ArrayList<String> fruit =  new ArrayList<String>(); 
 /**
  * 
  * Implement the printStack function
  *
  */
 public class Stack {
  
  public void push(String node) {
   fruit.add(node);
  }
  
  public String pop() {
    
   if(!isEmpty()) {
   String value = fruit.get(fruit.size()-1);
   fruit.remove(fruit.size()-1);
   return value;
   }
   
   else {
    System.out.println("There is nothing to pop");
    return null;
   }
  }
  
  public boolean isEmpty() {
   return fruit.size()==0;   
  }
  
  public void printStack() {
    
    ArrayList<String> tempData =  new ArrayList<String>(); 
    
    if(isEmpty()){
      System.out.println("Stack is empty");
    }
    
    while(!isEmpty()){
      String temp=pop();
      System.out.println(temp);
      tempData.add(temp);
    }
    
    for (int i = tempData.size()-1;i>=0;i--){
       push((String)tempData.get(i)); 
      }
  }
  
  
  /**
   * Implement the Queue functions here
   */
  public Stack() {
   
  }

 }
 
 ArrayList<String> q =  new ArrayList<String>(); 
 
 public class Queue{
  
  public void enqueue(String word) {
   q.add(word);
  }
  
  public String dequeue() {
    
   if(isEmpty()) {
   System.out.println("There is nothing to dequeue");
    return null;
   
   }
   
   else {
    return q.remove(0);
   }
  }
  
  public boolean isEmpty() {
   return q.size()==0;   
  }
  
  public void printQueue() {
    
    for (int i = 0; i<q.size(); i++){
    String temp1 = dequeue();
    System.out.println(temp1);
    enqueue(temp1);
    }
    
  }
   
  public Queue() {
   
  }
 }
 
/**
 * 1) Finish the Stack Class so that the print_stack method prints the stack vertically so that for instance ['a','b','c'] is printed 
 * a
 * b
 * c
 * 
 * 
 * 2) Write Queue functions for enqueue, dequeue, isEmpty and printQueue
 */
 public Assignment2() {
  Stack fruit= new Stack();
  fruit.pop();
  fruit.push("Apple");
  fruit.push("Banana");
  fruit.pop();
  fruit.push("Canned Yams");
  fruit.push("Durian");
  fruit.printStack();
  fruit.pop();
  fruit.pop();
  fruit.printStack();
  
  
  Queue q= new Queue();
  q.enqueue("Job 1");
  q.enqueue("Job 2");
  q.enqueue("Job 3");
  q.printQueue();
  q.dequeue();
  q.dequeue();
  q.printQueue();

 }

 
 public static void main(String[] args) {
  new Assignment2();

 }
}
