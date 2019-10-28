package cm;

import cm.core.CommandSequencePlayer;
import cm.core.Macro;

public interface MacrosManager {	
	void setMacros(final Macro[] macros);
	CommandSequencePlayer commandSequencePlayer();
}
