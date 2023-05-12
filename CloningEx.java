package objectcloning;

class Rectangle implements Cloneable{

	int l, b;	

	void getArea() {

		System.out.println("Area ="+(l*b));

	}

	protected Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

	

}

public class CloningEx {

	public static void main(String[] args) throws CloneNotSupportedException {

		// TODO Auto-generated method stub

          Rectangle r1 =new Rectangle();

          r1.l=20;

          r1.b=10;

          r1.getArea();

          Rectangle r4=(Rectangle) r1.clone();

          r4.l=30;

          r4.getArea();

          r1.getArea();
          }
          }
