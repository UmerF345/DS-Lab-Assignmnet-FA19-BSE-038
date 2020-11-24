//Muhammad Umer Farooq (FA19-BSE-038)//

package test;

class Node { 
    int key; 
    Node next; 
} 

class Queue { 
    Node front, rear; 

    public Queue() 
    { 
        this.front = this.rear = null; 
    } 
    public void enterqueue(int key) 
    {  
        Node temp = new Node(); 
        temp.key = key; 
        temp.next = null; 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
        } 
        else 
        {    
            this.rear.next = temp; 
            this.rear = temp; 
        } 
    }
    public void deletequeue() 
    {  
        if (this.front == null) 
            return; 

        Node temp = this.front; 
        this.front = this.front.next; 
        if (this.front == null) 
            this.rear = null; 
    } 
} 
public class Test { 
    public static void main(String[] args) 
    { 
        Queue q = new Queue(); 
        q.enterqueue(1); 
        q.enterqueue(2); 
        q.deletequeue(); 
        q.enterqueue(3); 
        q.enterqueue(4); 
        q.enterqueue(5); 
        q.deletequeue(); 
        System.out.println("Queue Front : " + q.front.key); 
        System.out.println("Queue Rear : " + q.rear.key); 
    } 
} 