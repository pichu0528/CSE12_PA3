import java.util.*;

public Queue12<E> implements BoundedQueue<E>{
  private Deque<E> stack;
  
  // Constructor
  public Queue12(int c){
    stack = new Deque12(c);
  }
  /* Find the maximum number of elements it can hold.
   * @Return the capacity of the BoundedQueue.
   */ 
  public int capacity(){
  
  }
  
  /* Removes the element at the head of the BoundedQueue.
   * @Return the element removed, or null if the size was zero.
   */
  public E dequeue(){
    stack.
  }
  
  /* Add the specified element to the end of the BoundedQueue.
   * @Return true if the operation succeeded, else false.
   * @Para e - the element to add to the queue
   * @Throw NullPointerException 
   */
  public boolean enqueue(E e){
  
  }
  
  /* Compares the specified object with BoundedQueue for equality.
   * @Return true if and only if the specified Object is equal to 
   * the BoundedQueue.
   * @Overrides: equals in class java.lang.Object
   */
  public boolean equals(java.lang.Object o){
  
  }
  
  /* Check if the size of BoundedQueue is greater than zero first, then
   * seek for the first element in the BoundedQueue.
   * @Return the element at the head, or null if the size was zero.
   */
  public E peek(){
    if(stack.size() > 0)
    {
      E temp = stack.peekFront();
      return temp;
    }
    else
      return null;
  }
  
  /*@Return the number of element in the BoundedQueue.
   */
  public int size(){
  return stack.size();
  }