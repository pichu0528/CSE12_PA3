import java.util.*;
import junit.framework.*;
import java.lang.*;

public class BoundedDequeTester extends junit.framework.TestCase{
  
  /* Test the Method - Make sure to add the specified element to the back of this 
   * BoundedDeque.
   * @Return true if the element was added.
   * @Throw nullPointerException.
   **/
  public void testaddBack(){
    BoundedDeque<Integer> deque = new Deque12<Integer>(3);
    if(deque.size() < deque.capacity())
    {
      deque.addBack(1);
      deque.addBack(2);
      assertEquals(new Integer(2), deque.peekBack());
      
      deque.addBack(3);
      assertEquals(new Integer(3), deque.peekBack());
      
      try{
        deque.addBack(null);
      }
      catch(NullPointerException n){}
    }
  }
  
  /* Test the Method - Make sure to add the specified element to the front of this 
   * BoundedQueue. 
   * @Return true if the element was added.
   * @Throw NullPointerException. 
   **/
  public void testaddFront(){
    BoundedDeque<Integer> deque = new Deque12<Integer>(3);
    if(deque.size() < deque.capacity())
    {
      deque.addFront(1);
      deque.addFront(2);
      assertEquals(new Integer(2), deque.peekFront());
      
      deque.addFront(3);
      assertEquals(new Integer(3), deque.peekFront());
      
      try
      {
        deque.addFront(null);
      }
      catch(NullPointerException n){}
    }
  }
 /* Test the Method - Test to seek the maximum number of elements it can hold
  * @Return - The capacity of BoundedDeque.
  **/ 
  public void testCapacity(){
    for(int i = 0; i < 10000; i++)
    {
      BoundedDeque<Integer> deque = new Deque12<Integer>(i);
      assertEquals(new Integer(i), deque.capacity(i));
    }
  }
  
  /* Test the Method - To check if the specified object in this BoundedDeque has t
   * the same type as the BoundedDeque.
   * @Return true if the specified object is equal to BoundedDeque
   */ 
  public void testEquals(){
    for(int i = 0; i < 10000; i++)
    {
      BoundedDeque<Integer> deque = new Deque12<Integer>(i);
      BoundedDeque<Integer> temp = new Deque12<Integer>(i);
      
      deque.addFront(1);
      deque.addFront(10);
      deque.addFront(100);
      temp.addFront(1);
      temp.addFront(10);
      temp.addFront(100);
      assertTrue(deque.equals(temp));
      
      deque.addBack(2);
      deque.addBack(20);
      deque.addBack(200);
      temp.addBack(2);
      temp.addBack(20);
      temp.addBack(200);
      assertTrue(deque.equals(temp));
    }
  }
  
  /* Test the Method - Check if the element returns from the back of the 
   * BoundedDeque, or null if there is no such element.
   * @Return element at the back, or null if the size was zero.
   */ 
  public void testpeekBack(){
    BoundedDeque<Integer> deque = new Deque12<Integer>(100);
    if(deque.size() > 0)
    {
      deque.addBack(1);
      deque.addBack(2);
      deque.addBack(3);
      assertEquals(new Integer(3), deque.peekBack());
    }
    else 
     fail();
  }
  
  /* Test the Method - Check if the element returns from the front of the 
   * BoundedDeque, or null if there is no such element.
   * @Return the element at the front, or null if the size was zero
   */ 
  public void testpeekFront(){
    BoundedDeque<Integer> deque = new Deque12<Integer>(100);
    if(deque.size() > 0)
    {
     deque.addFront(1);
     deque.addFront(2);
     deque.addFront(3);
     assertEquals(new Integer(3), deque.peekFront());
    }
    else 
      fail();
    
  }
  
  /* Test the Method - Check if the method really removed the element at 
   * the back of this BoundedDeque.
   * @Return the element removed, or null if there was no such element.
   */
  public void testremoveBack(){
    BoundedDeque<Integer> deque = new Deque12<Integer>(100);
    if(deque.size() > 0)
    {
      deque.addBack(1);
      deque.addBack(2);
      deque.addBack(3);
      // Remove for the first time
      deque.removeBack();
      // Check the element that is allocated before the one that is removed
      assertEquals(new Integer(2), deque.peekBack());
      // Remove for the second time
      deque.removeBack();
      // Check the element that is allocated before the one that is removed 
      assertEquals(new Integer(1), deque.peekBack());
      deque.addBack(200);
      deque.removeBack();
      assertEquals(new Integer(200), deque.peekBack());
      deque.addBack(null);
      deque.removeBack();
      assertEquals(new Integer(null), deque.peekBack());
    }
    else
    fail();
  }
  
  /* Test the Method - Check if the method really removed the element at the 
   * front of this BoundedDeque.
   * @Return  the element removed, or null if the size was zero
   */
  public void testremoveFront(){
    BoundedDeque<Integer> deque = new Deque12<Integer>(100);
    if(deque.size() > 0)
    {
     deque.addFront(1);
     deque.addFront(2);
     deque.addFront(3);
     deque.removeFront();
     assertEquals(new Integer(2), deque.peekFront());
     deque.removeFront();
     assertEquals(new Integer(1), deque.peekFront());
    }
    else
      fail();
  }
  
  /* Test the Method - Check for the size.
   * @Return the number of elements in this BoundedDeque
   */ 
  public void testSize(){
    BoundedDeque<Integer> deque = new Deque12<Integer>(100);
    for(int i = 0; i < 100; i++)
    {
      deque.add(i);
      assertEquals(deque.size(), i);
    }
    if(deque.size() <= 0)
      fail();
  }
  
  public static void main(String[] args){
    junit.swingui.TestRunner.main(new String[]{"BoundedDequeTester"});
    }
  
}