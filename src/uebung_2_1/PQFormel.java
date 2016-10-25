package uebung_2_1;

public class PQFormel {

		public static void main(String[] args) {
				double p=8;
				double q=16;
				
				double unterDerWurzel = ((p/2)*(p/2))-q;
				double vorDerWurzel = -1*p/2;
		
		if(unterDerWurzel <0) {
			System.out.println("PQ-Formel ergibt keine Loesung.");
		} else {
			
			if(unterDerWurzel ==0) {
				System.out.println("x =" + vorDerWurzel);
			} else {			
				
				double loesung1=vorDerWurzel + Math.sqrt(unterDerWurzel);
				double loesung2=vorDerWurzel - Math.sqrt(unterDerWurzel);
				
				System.out.println("x1 = " + loesung1);
				System.out.println("x2 = " + loesung2);
					}
				}
		}
}
