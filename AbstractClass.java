package AbstractInterface;

class AbstractClass extends ParentClass {
	
    void display()
	{
		System.out.println("Abstract method");
	}

	public static void main(String[] args)
	{
		ParentClass pc = new AbstractClass();
		pc.display();
	}

}


abstract class ParentClass
{
	abstract void display();
}