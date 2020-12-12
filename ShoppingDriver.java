package lab4;

import java.util.Arrays;

public class ShoppingDriver <T> implements Shopping <T>{
	public T[] bag;
	private int numOfEntries;
	private static final int MAX_CAPACITY = 25;
	
	public ShoppingDriver(int capacity){
		T[] tempbag = (T[]) new Object[capacity];
		bag = tempbag;
		numOfEntries=0;
	}
	
	public void Arraybag1(int capacity){
		T[] tempbag = (T[]) new Object[capacity];
		bag = tempbag;
	}
	public boolean add(T newEntry){
		boolean result = true;
		if(isArrayFull()){
			result = false;
		}
		else{
			bag[numOfEntries]=newEntry;
			numOfEntries++;
			return result;
		}
		return result;
	}


	@Override
	public T toArray(){
		T[] tempbag=(T[]) new Object[numOfEntries];
		for(int i = 0; i < numOfEntries; numOfEntries++){
			tempbag[i]=bag[i];
		}
		return (T) tempbag;
	}

	private void doubleCapacity(){
		int newLength = 2*bag.length;
		checkCapacity(newLength);
		bag = Arrays.copyOf(bag,  newLength);
	}
	
	private void checkCapacity(int caacity){
		int capacity = 0;
		if(capacity > MAX_CAPACITY){
			
		}
	}
	public T remove() {
		T result=null;
		if(numOfEntries>0){
			result = bag[numOfEntries-1]=null;
			numOfEntries--;
	}
		return result;
}

	@Override
	public boolean isArrayFull() {
		return numOfEntries == bag.length;
	}

}
