package lab4;

public interface Shopping <T>{
	
	public boolean add(T newEntry);
	
	public T remove();
	
	public T toArray();
	
	public boolean isArrayFull();
	

}
