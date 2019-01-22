package items.core.singleton;

public class SingletonClass {

	private static SingletonClass INSTANCE=null;
	
	
	private SingletonClass()
	{
		System.out.println(" initialize Singleton class");
	}
	
	public static SingletonClass getInstance()
	{
		if(INSTANCE==null)
			return new SingletonClass();
		else
			return INSTANCE;
	}
}
