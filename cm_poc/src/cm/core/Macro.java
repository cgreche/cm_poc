package cm.core;

public interface Macro {
	String id();
	String description();
	int activationKey();
	int flags();
	MacroExecutor executor();
}
