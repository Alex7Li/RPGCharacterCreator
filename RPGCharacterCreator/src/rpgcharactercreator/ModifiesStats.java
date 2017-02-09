package rpgcharactercreator;

import javax.swing.Icon;

public abstract interface ModifiesStats {
	  abstract int[] getStats();
	  abstract String getDescription();
	  abstract Icon getPicture();
	  abstract void select(String name);
}
