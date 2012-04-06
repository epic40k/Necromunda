package necromunda;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.jme3.math.Vector3f;

public class Building {
	private Map<String, String> identifierToTexture;
	
	public Building() {
		this.identifierToTexture = new HashMap<String, String>();
	}
	
	public void put(String identifier) {
		put(identifier, identifier);
	}

	public void put(String identifier, String texture) {
		identifierToTexture.put(identifier, texture);
	}
	
	public String get(String identifier) {
		return identifierToTexture.get(identifier);
	}
	
	public Set<Entry<String, String>> getEntrySet() {
		return identifierToTexture.entrySet();
	}
}
