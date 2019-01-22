package items.core.dependencyinjection;

import java.util.Objects;

public class DependencyInjectionExample {

	private final Object objectType;
	
	// this will instantiate object of type passed in constructor while creating the object
	public DependencyInjectionExample(Object obj)
	{
		this.objectType=Objects.requireNonNull(obj);
	}
	
}
