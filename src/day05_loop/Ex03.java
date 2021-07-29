package day05_loop;

public class Ex03 {
	public static void main(String[] args) {

int evensum=0 , oddsum=0;
	
	for(int su=1; su<=10; su++) {
		if(su%2 ==0){
			evensum+=su;
		}else {
			oddsum+=su;
		}
	}
	System.out.println("Â¦¼öÇÕ"+evensum);
	System.out.println("È¦¼öÇÕ"+oddsum);
	
	
	}
}
