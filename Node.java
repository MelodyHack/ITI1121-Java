import java.util.*;
public class Node{
  
  
  //Instance variables
  private Job data;
  private Node next;
  
  /*
   * The constructor for Node initializes its two instance variables. It gets
   * the data and the reference to the next node.
   * 
   * @param data A object of type Job
   * @param next A reference of type Node
   */
  public Node(Job data, Node next){
    this.data=data;
    this.next=next; 
  }
  /*
   * The constructor for Node initializes its two instance variables. It gets
   * the data and sets the variable next to null
   * 
   * @param data A object of type Job
   * @param next A reference of type Node
   */
  
  public Node(Job data){
    this.data=data;
    this.next=null; //check if this is legal
  }
  
  /**
   * Gets the data of the Node.
   * 
   * @return A object of type Job 
   */
  public Job getData(){
    return data;
  }
   /**
   * Gets ta reference to the next Node.
   * 
   * @return A object of type Node 
   */ 
  public Node getNext(){
    return next; 
  }
  
  /**
   * Sets the data of the Node. 
   */
  public void setData(Job data){
    this.data=data;
  }
  /**
   * Sets the reference of the node.
   */
  public void setNext(Node next){
    this.next=next;
  }
  
}

