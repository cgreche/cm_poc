package cm.core;

import cm.data_structure.CMMap;

public interface Module {
	String name();
	CMMap requires();
	CMMap exports();
	
	Object get(String property);
}
