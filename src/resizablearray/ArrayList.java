package resizablearray;

import java.util.Arrays;

public class ArrayList {

	Object ar[];
	int count=0;
	int initCap=ResizableArray.initialCap;
	ArrayList() {
		ar=new Object[initCap];
	}
    ArrayList(int initialCap) {
    	this.initCap=initialCap;
    	ar =new Object[initCap];
    }
    
    public boolean add(Object o) {
    	if(count<ResizableArray.loadfactor) {
    		ar[count]=o;
    		count++;
    	}
    	else {
    		Object temp[]=new Object[ar.length*2];
    		for(int i=0;i<count;i++) {
    			temp[i]=ar[i];
    		}
    		temp[count]=o;
    		ar=temp;
    		count++;
    	}
    	return true;
    }
    public boolean add(int index,Object o) {
    	if(index>=count) {
    	 throw new  IndexOutOfBoundsException("Enter a valid index");
    	}
    	else {
    		if(count<ResizableArray.loadfactor) {
    			rightShift(ar,index);
    			ar[index]=o;
        		}
        	else {
        		Object temp[]=new Object[ar.length*2];
        		for(int i=0;i<count;i++) {
        			temp[i]=ar[i];
        		}
        		temp[count]=o;
        		ar=temp;
        		count++;
        	}
    	}
    	
         return true;
   }
    public boolean rightShift(Object ar[],int index) {
    	if(index>=count) {
       	 throw new  IndexOutOfBoundsException("Enter a valid index");
       	}
       	else {
       		if(count<=ResizableArray.loadfactor) {
       			for(int i=count-1;i>=index;i--) {
       				ar[i+1]=ar[i];
       			}
       			
           	}
           	else {
           		Object temp[]=new Object[ar.length*2];
        		for(int i=0;i<count;i++) {
        			if(i<index) {
        				temp[i]=ar[i];
        			}
        			else {
        				temp[i+1]=ar[i];
        			}
        				
               }
             }
       }
    	count++;
    	return true;
   }
    public String toString() {
		return Arrays.toString(ar);
    	
    }
	
	
}
