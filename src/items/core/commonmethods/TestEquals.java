package items.core.commonmethods;

public class TestEquals {

	private int value;
	private int dimension;
	private String name;
	private double formula=value*dimension;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dimension;
		long temp;
		temp = Double.doubleToLongBits(formula);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + value;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestEquals other = (TestEquals) obj;
		if (dimension != other.dimension)
			return false;
		if (Double.doubleToLongBits(formula) != Double.doubleToLongBits(other.formula))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFormula() {
		return formula;
	}
	public void setFormula(double formula) {
		this.formula = formula;
	}
	
	
	
	
}
