package items.core.singleton;

public class Test {

	public static void main(String[] args)
	{
		
		
		SingletonClass obj=SingletonClass.getInstance();
		
		SingletonEnum objenum=SingletonEnum.INSTANCE;
		
		objenum.readEnum();
		
	}
}
