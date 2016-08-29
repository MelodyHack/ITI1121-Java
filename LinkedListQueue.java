import java.util.*;

public class LinkedListQueue implements Queue{
  
  //Instance variables
  private Node head;
  private Node tail;
  
  /**
   * The constructor sets the value of both and tail to null 
   * */
 
  public LinkedListQueue(){
    this.head=this.tail=null;
  }
  public boolean isEmpty(){
    return(head==null);  
  }
   /**
   * Adds an elemenat the end of the queue. 
   *If the queue is empty, the new element is added and the element is added and both the head and tail are set to reference this new element. 
   * If the queue has multiple elements, the element is simply added at the end and tail references the new last element.
   * @param o A object of type Job
   */
  public void enqueue(Job o){
    
    Node newLastElement= new Node(o); 
    
    if(tail==null && head==null){
      tail=newLastElement;
      head=tail;
    }
    else{
      tail.setNext(newLastElement);
      tail = newLastElement;
      //tail.setNext(null); 
    }
  }
  
  /**
   * The dequeue method creates and instance of type node.
   * Stores the content of the head inside the variable saved, of type Job
   * Sets the content of head to null once its content has been saved
   * If the queue is empty, sets the tail reference variable to null
   * @return A reference variable saved that contains the content of the head of the queue that has been removed
   */
   
  public Job dequeue(){
    
    if(isEmpty()){ //equivalent to saying: if the head is null 
      throw new NoSuchElementException("Cannot remove/dequeue while queue is empty");
    } 
    
    Node toBeRemoved = head;
    Job saved = head.getData();
    head=head.getNext();
    
    if(head==null){ 
      tail=null;
    }
    
    //toBeRemoved.setData(null);
    toBeRemoved.setNext(null);
    
    return saved;
    
  }
  /**
   * The clear method is not called if the queue is empty
   * Once the clear method is called, starting from the head, it traverses the entire queue
   * setting the contents of the head to null. It then proceeds to making head equate to the next node and continues 
   * the new heads to null until the reference to the next node is null
   */
  
  public void clear(){
    if(isEmpty()){ //equivalent to saying: if the head is null 
      throw new NoSuchElementException("Cannot remove/dequeue while queue is empty");
    }
    Node p = head;
    while(head.getNext()!=null){
      head=head.getNext();
      p.setData(null); //scrubbing the memory 
      p.setNext(null);//scrubbing the memory 
    }
    
    Node tmp = head;
    if(head.getNext()==null)
    head.setData(null);
    head=null;
    tail=head;
    
  }
  
  
}

