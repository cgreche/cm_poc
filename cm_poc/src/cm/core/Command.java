package cm.core;

import cm.data_structure.CMMap;

public interface Command {
	String identifier();
	String description();
	int flags();
	CMMap params();
}
