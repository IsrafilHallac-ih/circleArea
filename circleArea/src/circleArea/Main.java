package circleArea;
import java.util.Scanner;
public class Main {

	
		
	
		    public static void main(String[] args)
		    {
		       int yaricap =0;
		       double pi=Math.PI;
		       double a=0;
		       
		       Scanner in = new Scanner(System.in);
		       System.out.println("YariCapi Giriniz :");
		      System.out.print("Merkez A�� �lc�s� :");
		       yaricap=in.nextInt();
		       a=in.nextDouble();
		       //daire/�ember �evre bulma
		       double cemberCEvre = 2 * pi * yaricap;
		       //daire/�ember alan  bulma
		       double cemberAlan = pi* yaricap * yaricap;
		       //�ember merkez bulma
		       double cemberMerkez=(pi*(yaricap*yaricap)*a)/360;
		       
		       System.out.println("Cemberin Cevresi : " + cemberCEvre);
		       System.out.println("Cemberinn Alani: " + cemberAlan);
		       System.out.println("Cemberin Merkezi :" +cemberMerkez);
		       
		    }
	

	}

