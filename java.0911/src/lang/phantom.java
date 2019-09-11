package lang;


//번호,이름,나이를 저장하기 위한 DTO클래스

public class phantom {
	    //필요한 속성 선언
		private int num;
		private String name;
		private int age;
		
		
		
		
		
		public phantom() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public phantom(int num, String name, int age) {
			super();
			this.num = num;
			this.name = name;
			this.age = age;
		}
		
		
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "phantom [num=" + num + ", name=" + name + ", age=" + age + "]";
		}
		//데이터를 복제해주는 메소드
		public phantom clone() {
			//새로운 인스턴스를 생성
			phantom other = new phantom();
			//데이터들을복사
			other.num = this.num;
			other.name = this.name;
			other.age = this.age;
			
			//새로만들어진 데이터를 리턴
			return other;
		}
		
		//내용을 비교해주는 메소드
		public boolean equals(phantom other) {
			if(this.num != other.num) {
				return false;
			}
			return true;
		}
	
	

}
