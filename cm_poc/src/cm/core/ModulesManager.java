package cm.core;

import cm.data_structure.CMList;

public interface ModulesManager {
	CMList modules();
	Module module(String moduleName);
}
