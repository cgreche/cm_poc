package cm.core;

public interface CMContext {
	String basePath();
	String sysVersion();
	ModulesManager pluginManager();
	MacrosManager macrosManager();
}
