package util.adts;


public interface QListWithSelection<E> extends QList<E>
{
	
	abstract void select (int i);
	
	abstract boolean someSelected();
	
	abstract int getIndexSelected();
	
	abstract void next();
	
	abstract void previous();
	
	abstract void remove();
	
	abstract E getSelected();

	abstract void moveUp(int i);

}
