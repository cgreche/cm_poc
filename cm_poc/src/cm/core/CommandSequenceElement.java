package cm.core;

public interface CommandSequenceElement {
	Command command();
	int repeatCount();
}
