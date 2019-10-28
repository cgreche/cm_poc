package cm.core;

import cm.data_structure.CMList;

public interface CommandSequencePlayer {
	CMList commands();
	int commandCount();
	int cursor();
	boolean isPlaying();
}
