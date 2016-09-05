import java.util.*;
import java.lang.*;

class Deque12<E> implements BoundedDeque<E>
{
  private E[] array;
  private int size, capacity, front, back;
  
  // Ctor of Deque12
  public Deque12(int capacity)
  {
    array = (E[])(new Object[capacity]);
    front = 0;
    back = size - 1;
    capacity = this.capacity;
    size = this.size;
    
  }
  
  /* Adds the specified element to the back of this BoundedDeque.
   * Check if the size is less than its capacity. At the end, the element 
   * is added at the back and the size is increased by 1.
   * @Para e - the element to add to the back of the list.
   * @Return true if the element was added, else false.
   * @Exception NullPointerException - if the element is null, and size is less 
   * than capacity.
   */ 
  public boolean addBack(E e) throws NullPointerException
  {
    if(e == null)
    {
      throw new NullPointerException();
      return false;
    }
    if(capacity < size)
    {
      throw new NullPointerException();
      return false;
    }
    if(capacity > size)
    {
      array[back] = e;
      back--;
      size++;
      if(back < 0)
      {
        back = capacity - 1;
      }
      return true;
    }
  }
  
  /* Adds the specified element to the front of this BoundedDeque.
   * Check if the size is less than its capacity. At the end, the element 
   * is added at the front and the size is increased by 1.
   * @Para e - the element to add to the back of the list.
   * @Return true if the element was added, else false.
   * @Exception NullPointerException - if the element is null, and size is less 
   * than capacity.
   */ 
  public boolean addFront(E e) throws NullPointerException
  {
    if(e == null)
    {
      throw new NullPointerException();
      return false;
    }
    if(capacity < size)
    {
      throw new NullPointerException();
      return false;
    }
    if(capacity > size)
    {
      array[front] = e;
      front++;
      size++;
      if(front > capacity - 1)
      {
        front = 0;
      }
      return true;
    }
      
  }
  
  /* Find the maximum number of elements it can hold.
   * @Return the capacity of this BoundedDeque.
   */ 
  public int capacity()
  {
    return capacity;
  }
  
  /* Compares the specified object with the BoundedDeque
   * @Para o - object to compare to this DoundedDeque for equality.
   * @Return true if the specified object is equal to the BoundedDeque.
   */ 
  public boolean equals(java.lang.Object o)
  {
    if(o instanceof BoundedDeque<E> && o.equals(peekFront()))
    {
      return true;
    }
    else 
      return false;
  }
  
  /* Seek for the element that is located at the end of the BoundedDeque.
   * @Return the element at the back, or null if the size was zero.
   */ 
  public E peekBack()
  {
    if (array[back] != null && size > 0)
    {
      return array[back];
    }
    else 
      return null;
  }
  
  /* Seek for the element that is located at the front of the BoundedDeque.
   * @Return the element at the front, or null if the size was zero.
   */ 
  public E peekFront()
  {
    if (array[front] != null && size > 0)
    {
      return array[front];
    }
    else 
      return null;
  }
  
  /* First of all, To make surethat BoundedDeque's size is greater than zero.
   * Then, Removes the element at the end of this BoundedDeque. After, the size 
   * is decreased by 1.
   * @Return the element removed, or null if the size was zero.
   */ 
  public E removeBack()
  {
    if(size > 0)
    {
      E end = peekBack();
      array[back] = null;
      back++;
      size--;
      if(back > capacity - 1)
      {
        back = 0;
      }
      return end;
    }
    return null;
  }
  
  /* First of all, To make surethat BoundedDeque's size is greater than zero.
   * Then, Removes the element at the front of this BoundedDeque. 
   * After, the size is decreased by 1.
   * @Return the element removed, or null if the size was zero.
   */ 
  public E removeFront()
  {
    if(size > 0)
    {
      E first = peekFront();
      array[front] = null;
      front--;
      size--;
      
      if(front == 0)
      {
        front = capacity - 1;
      }
      return first;
    }
    return null;
  }
  
  /* @Return the number of elements in the BoundedDeque.
   */ 
  public int size()
  {
    return size;
  }
}
  