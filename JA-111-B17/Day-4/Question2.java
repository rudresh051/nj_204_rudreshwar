class Demo
{
	String s;
	int i;
	float f;

	// 4 parameterized constructors
	Demo(){
		System.out.println("no parameter constructor");
	}

	Demo(String s){
		System.out.println("parameter constructor with string s");
		this.s = s;

	}
	Demo(int i){
		System.out.println("parameter constructor with int i");
		this.i = i;
	}
	Demo(float f){
		System.out.println("parameter constructor with float f");
		this.f = f;	
	}

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
	}
}
