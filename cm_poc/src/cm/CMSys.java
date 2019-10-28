package cm;

import cm.core.CMContext;

public interface CMSys {
	CMContext init(String configurationFilePath);
	void process();
	void destroy();
	
	CMContext context();
}
