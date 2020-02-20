import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ClientApp2 {
public static void main(String[] args) throws IOException{
	OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for Standard Material \n Enter 2 for  above standard materials\n Enter 3 for high standard material\n Enter 4 for  high standard material and fully \r\n" + 
			"automated home");
	int std=sc.nextInt();
	System.out.println("Enter Total Area");
	int totalarea=sc.nextInt();
	ConstructionCost cobj=new ConstructionCost(std, totalarea);
	streamWriter.write(cobj.getConstructionCost()+"");
	System.out.println("Total Construction Cost is");
	streamWriter.flush();
}
}
