package cm.core;

import cm.data_structure.CMList;

public interface MacroExecutor {
	void execute(MacroExecutionContext context, CMList commandExecutionSequence);
}
