package cm;

import cm.data_structure.CMList;

public interface ModulesManager {
	CMList modules();
	Module module(String moduleName);
}
