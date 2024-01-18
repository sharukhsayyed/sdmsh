
public class Prob_1 {
	
	
	

	public static void main(String[] args) {
		
	//139
				String s = "applepensapple";
				String worddict[] = {"apple","pen"};
				System.out.println("hi");
				String st1="";
				int n=s.length();
				System.out.println(n);
				int m=0;
				
		for(int i=0;i<s.length();i++) {
			
			 st1=st1+s.charAt(i);
	
			for(int j=0;j<worddict.length;j++) {
				
				if(st1.equals(worddict[j])) {
					System.out.println(".");
					System.out.println(st1);
					m=st1.length()+m;
					st1="";
					System.out.println(i);
					
				}
				if((i+1)==n) {
				System.out.println(i);
				if(m==n) {
					System.out.println("yesss");
				}
				else {
					System.out.println("false");
				}
				}
				
				
				
			}
		}
		
		

	}

}
