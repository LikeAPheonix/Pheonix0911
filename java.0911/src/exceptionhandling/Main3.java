package exceptionhandling;

public class Main3 {

	//이렇게 main에 throws를 만들면 예외가 발생할경우 운영체제가 처리합니다.
	//main은 운영체제가 처리하기 때문입니다.
	
	public static void main(String[] args)
			
		throws InterruptedException{
		//1-10까지 1초씩 대기하면서 출력하기
	    for(int i = 1; i<=10; i=i+1) {
			System.out.printf("i:%d\n",i);
			//1초씩 대기
			
				Thread.sleep(1000);
			
		}

	}

	}
	
