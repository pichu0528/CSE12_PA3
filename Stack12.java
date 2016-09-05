import java.util.*;

public Stack12<E> implements BoundedStack<E>{ 
  private Deque<E> stack;
  // Constructor
  public Stack12(int c){
    stack = new Deque12(c);
  }
  
  /* Find the maximum number of elements it can hold
   * @Return the capacity of this capacity
   */ 
  public int capacity(){
  
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
  
  }
  
  /* Removes the element at the head of the BoundedQueue.
   * @Return the element removed, or null if the size was zero.
   */
  public E pop(){
  
  }
  
  /* Adds the specified element to the front of this BoundedDeque.
   * Check if the size is less than its capacity. At the end, the element 
   * is added at the front and the size is increased by 1.
   * @Para e - the element to add to the back of the list.
   * @Return true if the element was added, else false.
   * @Exception NullPointerException - if the element is null, and size is less 
   * than capacity.
   */ 
  public boolean push(E e){
  
  }
  
  /*@Return the number of element in the BoundedQueue.
   */
  public int size(){
  
  }