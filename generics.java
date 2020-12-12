package lab4;

public class generics {
	
	public static void main(String[] args){
		Integer[] a={1,2,3,4};
		Character[] b={'a','b','c'};
		
		System.out.println(returnElement(23,21));
		System.out.println(returnElement('a','b'));
		
		
	}
	
	public static void printme(Integer[] i){
		for(Integer x:i){
			System.out.println(x);
		}
	}
	
	public static void printme(Character[] i){
		for(Character x:i){
			System.out.println(x);
			
		}
	}
	
	public static <T> void printme(T[] x){
		for(T b:x)
		{
			System.out.println(b);
		}
	}
	
	public static <T> T returnElement(T a, T b){
		
		
	if(a==b)
		{
		return a;
			
		}
		else
		{
			return null;
		}
	}

}
