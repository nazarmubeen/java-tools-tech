package items.core.commonmethods;

public class CloneClass implements Cloneable {
	
	private String name;
	private int id;
	
	
	@Override
	protected CloneClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (CloneClass)super.clone();
	}
	
	
	@Override
	public String toString() {
		return "CloneClass [name=" + name + ", id=" + id + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
