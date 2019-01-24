package items.core.commonmethods;

public class Test {

	public static void main(String[] args)
	{
		CloneClass cobj=new CloneClass();
		cobj.setId(1);
		cobj.setName("first");
		
		CloneClass cclone;
		try {
			cclone = cobj.clone();
		} catch (CloneNotSupportedException e) {
			   throw new AssertionError();
		}
	
		System.out.println(cclone.equals(cobj));
		cloneTesting(cobj,cclone);
	}
	
	static boolean cloneTesting(CloneClass a, CloneClass b)
	{
		if(a==b)
			System.out.println(" a is = b");
		if(a.equals(b))
			System.out.println(" a equals b");
		if((a instanceof CloneClass) && (b instanceof CloneClass) )
			System.out.println(" a is instance of b");
			return true;
	}
	
}
