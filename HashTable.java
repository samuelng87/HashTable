package hash;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Two Integers
        Integer num1=new Integer("-999991"),
        		num2=new Integer("100990");
                
                // Two Doubles  
        Double  d1=new Double("-0.01123"),
        		d2=new Double("27.90");
                
                // Two Strings  
        String  s1=new String("ABCDEF"),
        		s2=new String("HIJKLM12");
                
        // Calculate and Display Hash Codes for these Objects   
        
        		System.out.println("Has code outcome");
        
        		System.out.println("Integer ("+num1+") is: "+num1.hashCode());
        		
                System.out.println("Integer ("+num2+") is: "+num2.hashCode());
                
                System.out.println("Double  ("+d1+") is: "+d1.hashCode());
                
                System.out.println("Double ("+d2+") is: "+d2.hashCode());
                
                System.out.println("String ("+s1+") is: "+s1.hashCode());
                
                System.out.println("String ("+s2+") is: "+s2.hashCode());   		
	}

}
