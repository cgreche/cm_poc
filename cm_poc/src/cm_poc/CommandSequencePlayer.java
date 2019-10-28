package cm_poc;

import data.CMList;

public interface CommandSequencePlayer {
	CMList commands();
	int commandCount();
	int cursor();
	boolean isPlaying();
}
