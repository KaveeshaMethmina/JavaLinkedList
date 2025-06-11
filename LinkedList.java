public class LinkedList {
    int size;
    ChainNode head;

    LinkedList(){
        this.size = 0;
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

public void addFirst(Object elt){
    if(isEmpty()){
       head =  new ChainNode(elt); //chainNode class eken object ekak hadana eka karanne
    }

    else{
        new ChainNode(elt, head );
    }
    size ++;
    }

    

    public void addLast(Object elt){
        if(isEmpty()){
            new ChainNode(elt);

            
        }
        else{
            ChainNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new ChainNode(elt);
        }

        size++;
    }

    public Object removeFirst(){
        Object removeData = null; //remove krnnn yn data ek save krnn
        if(isEmpty()){
            System.out.println("Your Linked list is already empty!");
        }
        else{
            removeData = head.data;
            head = head.next;
            size --;
           
        }
       return removeData;
    }

  

public Object removeLast(){
    Object removeData = null;
    if(isEmpty()){
        System.out.println("Your Linked list is already empty!");
    }

    else{
        if(size == 1){
            removeData = head;
            head = null;
        }
        else{
            ChainNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
                
            }
            removeData = temp.next.data;
            temp.next = null;
            
        }



    }
     return  removeData;
}

}
