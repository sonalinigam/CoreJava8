
public final class ImmutableClass {
	private final String name;
	
	ImmutableClass(String name) {
	 this.name = name;
	}

	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + "]";
	}
	

}
