package constructorConcept;

public class ConstructorTest {
	int a;
	 int b;
	 
	 int c;
	 int d;
	 int e;
	
	public static void main(String[] args) {
		
		
		ConstructorTest ct=  new ConstructorTest(2,3);
		System.out.println( ct.a+" "+ ct.b);
		ConstructorTest ct1=  new ConstructorTest();
		
		
		
//		
//		System.out.println( ct.a+" "+ ct.b);
			
	}
	public ConstructorTest(){
		System.out.println("non paramterized/default constructor");
	} 
	
	public ConstructorTest(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("parameterized constructor");
		//System.out.println(a + " " + b);
	} 
	
	
	}
	


