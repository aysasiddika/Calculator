package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int fnum,snum;
		Add a = new Add();
		Substract s = new Substract();
		Division d = new Division();
		Multiply m = new Multiply();
		Square S=new Square();
		Cube C=new Cube();
		int c;
		Scanner b = new Scanner(System.in);
		c =b.nextInt();
		fnum=b.nextInt();
		snum=b.nextInt();
		Mod M=new Mod();
		if(c==1) {
			a.add(fnum, snum);
		}
			
		else if(c==2)
		{
			s.sub(fnum, snum);
		}
		else if(c==3)
		{
			d.div(fnum, snum);
		}
		else if(c==4)
		{
			m.mul(fnum, snum);
		}
		else if(c==5)
		{
			S.square(fnum);
		}
		else if(c==6)
		{
			M.mod(fnum,snum);
		}
		else
			
		{
			C.cube(snum);
		}
			
		

	}

}
