package util.adts;

public interface QListWithSelection<E>
{

	void select (int i);

	void add(E e);
	
	boolean someSelected();
	
	int getIndexSelected();
	
	void next();
	
	void previous();
	
	void remove();
	
	E getSelected();
	
	
	
	
}
