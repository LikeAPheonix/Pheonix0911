package exceptionhandling;

public class Main {

	public static void main(String[] args) {
	    int port = 8899;
		int a = 10;
		int b = 0;
		System.out.printf("a:%d b:%d\n",a,b);
	    
		try {
			//여기 문제가 발생하더라도 아래 문장들을 계속 처리합니다.
		System.out.printf("a/b\n",a/b);
		if(port == 8899) {
			//강제로 예외를 발생시
			
			throw new ArithmeticException();
		   }
	    }
		catch(Exception e) {
	    	System.out.printf("계산하는 도중 문제가 발생했습니다.\n");
	    	
	    	//프로그램 종료
	    	System.exit(0);
	    	 }
	    
	    System.out.printf("예외처리의목적에대해알아봅시다.\n");
	    
	}

}
