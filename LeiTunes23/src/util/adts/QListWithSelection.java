package util.adts;

public interface QListWithSelection<E> extends QList<E>
{
	
	void select (int i);
	
	boolean someSelected();
	
	int getIndexSelected();
	
	void next();
	
	void previous();
	
	void remove();
	
	E getSelected();
			
}
