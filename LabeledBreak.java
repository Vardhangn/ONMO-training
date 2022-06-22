package j;

public class LabeledBreak {
	public static void main(String[] args) {
		first:
			for(int i = 0;i<5;i++) {
				second:
					for(int j = 1; j<4; j++) {
						System.out.println("i="+i+";j="+j);
						if(i==2) {
							break second;	
						}
							
					}
			}
	}

}
