package dateorganizer;

import java.util.*;

/**
 * This class describes a priority min-queue that uses an array-list-based min binary heap 
 * that implements the PQueueAPI interface. The array holds objects that implement the 
 * parameterized Comparable interface.
 * @author Duncan
 * @param <E> the priority queue element type. 
 * @since 99-99-9999
 */
public class PQueue<E extends Comparable<E>> implements PQueueAPI<E>
{    
   /**
    * A complete tree stored in an array list representing the 
    * binary heap
    */
   private ArrayList<E> tree;
   /**
    * A comparator lambda function that compares two elements of this
    * heap when rebuilding it; cmp.compare(x,y) gives 1. negative when x less than y
    * 2. positive when x greater than y 3. 0 when x equal y
    */   
   private Comparator<? super E> cmp;
   
   /**
    * Constructs an empty PQueue using the compareTo method of its data type as the 
	* comparator
    */
   public PQueue()
   {
      //implement this method
      tree = new ArrayList<E>();
      cmp = E.compareTo();
   }
   
   /**
    * A parameterized constructor that uses an externally defined comparator    
    * @param fn - a trichotomous integer value comparator function   
    */
   public PQueue(Comparator<? super E> fn)
   {
	   // implement this method
      tree = new ArrayList<E>();
      cmp = fn;
   }

   public boolean isEmpty()
   {
      // implement this method
      return tree.isEmpty();
   }

   public void insert(E obj)
   {
      //implement this method
      tree.add(obj);
      rebuild((size() - 2) / 2);

   }

   public E remove() throws PQueueException
   {
      //implement this method
      E nodeToRemove = tree.get(0);
      tree.remove(0);
      return nodeToRemove;
      
   }
 
   public E peek() throws PQueueException
   {
      //implement this method
      return tree.get(0);
   }

   public int size()
   {
      //implement this method
      return tree.size();
   }
   
   /**
    * Swaps a parent and child elements of this heap at the specified indices
    * @param place an index of the child element on this heap
    * @param parent an index of the parent element on this heap
    */
   private void swap(int place, int parent)
   {
      //implement this method
      E temp = tree.get(parent);
      tree.set(parent, tree.get(place));
      tree.set(place, temp);
   }

   /**
    * Rebuilds the heap to ensure that the heap property of the tree is preserved.
    * @param root the root index of the subtree to be rebuilt
    */
   private void rebuild(int root)
   {
      //implement this method
      int leftIndex = 2 * root + 1;
      int rightIndex = 2 * root + 2;
      E rootNode = tree.get(root);
      E leftNode = tree.get(leftIndex);
      E rightNode = tree.get(rightIndex);
      if(cmp.compare(rootNode, rightNode) > 0 && cmp.compare(rootNode, leftNode) > 0){
         return;
      }
      if(cmp.compare(leftNode, rootNode) > 0){
         swap(leftIndex, root);
         rebuild((root - 1) / 2);
      } else if (cmp.compare(rightNode, rootNode) > 0){
         swap(rightIndex, root);
         rebuild((root - 1) / 2);
      }
      
   }
}