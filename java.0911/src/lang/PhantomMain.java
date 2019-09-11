package lang;

public class PhantomMain {

	public static void main(String[] args) {
		//UserVO 클래스의 객체를 생성하고 속성을 설정한후 내용을 출력
	    phantom vo1 = new phantom();
	    //속성을 설정
	    vo1.setNum(1);
	    vo1.setName("홍범도");
	    vo1.setAge(29);
	    
	    //내용을 출
	    System.out.printf("번호:%d 이름:%s 나이:%d\n",vo1.getNum(),vo1.getName(),vo1.getAge());
	    
	    
	    phantom vo2 = new phantom(2, "남지현", 34);
	    //객체의 모든 속성 확인하기
	    //데이터를 표현하는 클래스를 만들때는 toString()을 오버라이딩하고 
	    //확인할때는 아래처럼 이름만으로 확인
	    //toString() 메소드를 디버깅을 위한 메소드라고도 합니다.
	    System.out.printf("%s\n",vo2);
	    
	    //phantom 인스턴스 생
	    phantom vo3 = new phantom(3,"김씨",25);
	    //phantom이 가리키고 있는 곳의 참조를 vo4에복사
	    phantom vo4 = vo3;//실제 이런문장이 있다면 잘못된것
	    //vo4가 자신의 numdmf 31로변
	    vo4.setNum(31);
     	//vo3를 출력 - vo3 num도 31로 변경되있습니다.
	    System.out.printf("ㅇㅇ:%s\n",vo3);
	    //vo3 를복제
	    phantom vo5 = vo3.clone();
	    System.out.printf("vo3:%s\n",vo3);
	    System.out.printf("vo5:%s\n",vo5);
	   //vot5가 num을 변경 - vo3에는 영향이없
	    vo5.setNum(77);
	    System.out.printf("vo3:%s\n",vo3);
	    System.out.printf("vo5:%s\n",vo5);

	     phantom vo6 = vo3.clone();
	     System.out.printf("%b\n",vo6 == vo3); //내용을 비교하지 않기 때문에 false
	     System.out.printf("%b\n",vo6.equals(vo3)); //내용을 비교해서 true
	     
	     
	    
	}

}
