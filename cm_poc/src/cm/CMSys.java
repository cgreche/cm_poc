package cm;

public interface CMSys {
	CMContext init(String configurationFilePath);
	void process();
	void destroy();
	
	CMContext context();
}
