package cm_poc;

public interface Macro {
	String id();
	String description();
	int flags();
	//other properties
	
	MacroExecutor executor();
}
