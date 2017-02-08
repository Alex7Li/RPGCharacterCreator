package rpgcharactercreator;

import javax.swing.Icon;

public abstract interface ModifiesStats {
	  abstract int[] getStats();
	  abstract String getDescription(String name);
	  abstract Icon getPicture(String name);
	  abstract void select(String name);
}
