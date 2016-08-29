import java.util.*;

public class PriorityQueue implements Queue
{
  //instance variable 
  private Job[] heap;
  private int tail;
  private int size=10;
  
  /**
   * The constructor creates an empty array for the heap and sets the tail to 0.
   */
  public PriorityQueue()
  {
    heap = new Job[size];
    tail = 0;
  }
  //Sets the content of the queue to 0 making emptying the queue
  public boolean isEmpty()
  {        
   

    return tail==0;
    
    
    // Dummy return values; please remove
  }
  
  
  
  /////////////////////////////
  //ENQUEUE
  /////////////////////////////
  /**
   *Compares the tail to the size in order to verify if the heap array if full
   *Calls the reverseHeapify method in order to check if the the newest element has a bigger priority in order
   *to respec the heap proprity
   *If the heap array is full, the method resize is in oredr to double the size of the heap array.
   *In both cases, the tail is incremented in order to give it the biggest index
   * @param element of type Job
   * 
   */
  
  public void enqueue(Job element)
  {
   

    if(tail<size){
      heap[tail]=element;
      reverseHeapify(tail);
      tail=tail+1;
    }
    else{   
      resize();
      heap[tail]=element;
      reverseHeapify(tail);
      tail=tail+1;
    }
  }
  
  /////////////////////////////
  //DEQUEUE
  /////////////////////////////
  public Job dequeue()
  {
   

    if(tail==0){ //equivalent to saying: if isEmpty() 
      throw new NoSuchElementException("Cannot remove/dequeue while queue is empty");
    }   
    Job savedData = heap[0];
    swap(0, tail-1);
    heapify(0);
    tail--;
    
    return savedData;
  }
  /**
   * The method clear traverses every element of the heap array and sets the elements to null in order to clear them
   */
  public void clear()
  {
   

    for(int i=0; i<tail;i++){
      heap[i]=null;
    }
    tail=0;
  }
   /**
   *Creates a temporary array and stores the content of the heap array inside of the temporary one
   * The resize method doubles the size of the heap array. Afterwards, it copies the back the content that was
   * put on the temporary array 
   */
  private void resize()
  {
   

    int currentSize=heap.length;
    
    Job [] temp;
    temp=heap;
    currentSize=2*currentSize;
    heap=new Job[currentSize];
    System.arraycopy(temp,0,heap,0,currentSize/2);
    
  }
  
  /**
   * reverseHeapify works by comparing the current node with its parent 
   * to see if it is bigger. If the current node is bigger than it is swapped with its parent 
   * Since the child has now been put as the parent, it needs to continue and check if it is bigger than its new parent 
   * in order to keep the heap property. 
   * reverseHeapify works its way up the tree in this manner and, when it is complete, 
   * the tree should again be a heap. 
   * 
   * @param i The index of the node that we are not certain if it satisfied the
   * heap property (It may be larger than its parent).
   */
  
  private void reverseHeapify(int i)
  {
//   

    if(i==0){ //equivalent to saying: if the tail is null 
      return;
    }
    int parentOfChild = parent(i);
    
    
    while( i!=0 && (heap[i].getOwner()>heap[parentOfChild].getOwner()) ){
      swap(i, parentOfChild);
      i=parentOfChild;
      parentOfChild=parent(i);
      
    }
    
    
    
    
    
    
    
    
    
  }
  
  /**
   * Given an array index i, this method returns the array index of the i's
   * parent node in the heap.
   * 
   * @param i The index of the node for whom's parent we are searching.
   * @return The index in the array of i's parent.
   */
  private int parent(int i)
  {
    return (int) Math.floor((i - 1) / 2.0f);
  }
  
  /**
   * Given an array index i, this method returns the array index of the i's
   * left child node in the heap.
   * 
   * @param i The index of the node for whom's left child we are searching.
   * @return The index in the array of i's left child.
   */
  private int left(int i)
  {
    return 2 * i + 1;
  }
  
  /**
   * Given an array index i, this method returns the array index of the i's
   * right child node in the heap.
   * 
   * @param i The index of the node for whom's right child we are searching.
   * @return The index in the array of i's right child.
   */
  private int right(int i)
  {
    return 2 * i + 2;
  }
  
  /**
   * Swaps the Job's at position i and j.
   * 
   * @param i the array index of one of the job's to be swapped.
   * @param j the array index of the other job to be swapped.
   */
  private void swap(int i, int j)
  {
    Job temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }
  
  /**
   * Heapify works by comparing the current internal node with its children 
   * to see which is the largest. If the root is not the largest then it is 
   * swapped with the largest of its children. Since the child has now been 
   * altered it needs to check to make sure it still satisfies the heap property. 
   * Heapify works its way down the tree in this manner and, when it is complete, 
   * the tree should again be a heap. The details of how Heapify works are a 
   * little complex but the method is provided for you, you just need to 
   * understand when to use it.
   * 
   * The purpose of heapify is to restore the heap property after one of the 
   * internal nodes of the heap has been altered. In the case of a priority queue,
   * this internal nodes get altered during dequeue operations.
   * 
   * @param i The index of the node that we are not certain if it satisfied the
   * heap property (one or both of its children might be larger).
   */
  private void heapify(int i)
  {
    int l = left(i);
    int r = right(i);
    int largest = i;
    
    if (l < tail && 
        heap[l].getOwner() > heap[largest].getOwner())
    {
      largest = l;
    }
    
    if (r < tail &&
        heap[r].getOwner() > heap[largest].getOwner())
    {
      largest = r;
    }
    
    if (largest != i)
    {
      swap(i, largest);
      heapify(largest);
    }
  }        
}