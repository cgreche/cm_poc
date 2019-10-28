package cm_poc;

import java.util.Map;

public interface Command {
	String identifier();
	String description();
	int flags();
	Map<String, String> params();
}
