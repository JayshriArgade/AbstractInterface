package AbstractInterface;

interface example
{
	abstract void print();
}

class InterfaceConcept implements example
{
	public void print()
	{
		System.out.println("Interface method");
	}

	public static void main(String[] args)
	{
		InterfaceConcept ss = new InterfaceConcept();
		ss.print();
	}

}
