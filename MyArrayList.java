package com.example.blackjack;

public class MyArrayList implements MyList{
    Object[] obj =new Object[1];
    int size=0;
    public int size(){
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();}
            return obj[index];
        }


    public void add(Object o){
        if(size==obj.length){
            Object[] obj2 = new Object[obj.length*2+1];
            for (int i=0; i<obj.length; i++){
                obj2[i]=obj[i];
            }
            obj=obj2;
        }
        obj[size]=o;
        size++;
    }
   public void add(int index, Object o) {
       if (index < 0 || index > size)
           throw new IndexOutOfBoundsException();
       Object[] obj2;
       if (size == obj.length) {
           obj2 = new Object[obj.length * 2 + 1];
           for (int i = 0; i < obj.length; i++) {
               obj2[i] = obj[i];
           }
           obj = obj2;

       }
       for (int i = obj.length-1; i > index; i--) {
           obj[i] = obj[i - 1];
       }
           obj[index] = o;
       size++;
           }

   public void remove(int index) {
       if (index < 0 || index >= size) {
           System.out.println("Index " + index + " is out of Bounds.");
           throw new IndexOutOfBoundsException();
       }
       else{
           for (int i = 0; i < size - 1; i++){
               obj[i] = obj [i+1];
           }
           size--;
       }

   }
  public void remove (Object o){
        int index=indexOf(o);
        if(index>-1)
            remove(index);

  }
    public void set (int index, Object o){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        obj[index]=o;
    }
   public boolean contains (Object o){
        return indexOf(o)>-1;

   }
    public int indexOf (Object o){
        for (int i=0; i<size; i++){
            if(obj[i]==o)
                return i;
        }
        return -1;
    }


   public boolean isEmpty(){
       return size==0;
   }
   public void removeAll(){
       obj=new Object[1];
       size=0;
   }



}
