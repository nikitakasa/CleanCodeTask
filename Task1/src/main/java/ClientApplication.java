import java.io.*;
public class ClientApplication {
	  public static void main(String args[]) throws IOException {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        System.out.println("----------Simple Interest------------");   
	        System.out.println("Enter principal amount "); 
	        double principal=Double.parseDouble(br.readLine());
	        System.out.println(("Enter annual interest rate ")); 
	        double rate=Double.parseDouble(br.readLine());
	        System.out.println("Enter  time the money is invested or borrowed for"); 
	        double time=Double.parseDouble(br.readLine());
	        SimpleInterest si=new SimpleInterest(principal, rate, time);
	        Double s=si.getSimpleInterest();
	            System.out.println(s);
	        System.out.println("----------Compound Interest-----------");   
	        System.out.println("number of times that interest is compounded per unit time \n"); 
	        double n=Double.parseDouble(br.readLine());
	        CompoundInterest ci=new CompoundInterest(principal, rate, time, n);
	        double c=ci.getCompoundInterest();
	        bw.write(c+"\n");
	            bw.flush();
	  }
}
