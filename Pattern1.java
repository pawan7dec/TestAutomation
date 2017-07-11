
public class Pattern1 {
	
	public static void main(String[] args) {
		
		/*1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		1 2 3 4 5 6 
		1 2 3 4 5 6 7 */
		
	//----------------------------------------------------------------	
		for(int i=1;i<8;i++){
			
			for(int j=1;j<=i;j++){
				
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
	//------------------------------------------------------------------
		
		/*1 
		2 2 
		3 3 3 
		4 4 4 4 
		5 5 5 5 5 
		6 6 6 6 6 6 
		7 7 7 7 7 7 7 */
		
        for(int m=1;m<8;m++){
			
			for(int n=1;n<=m;n++){
				
				System.out.print(m+" ");
				
			}
			System.out.println();
			
		}
        
     //------------------------------------------------
        
      
	}

}
