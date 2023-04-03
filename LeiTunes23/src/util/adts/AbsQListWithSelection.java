package util.adts;

import java.util.Iterator;

/**
 * 
 * @author FC_56946 / FC_58234
 *
 * @param <E>
 */

public abstract class AbsQListWithSelection<E>  implements QListWithSelection<E>
{
	E selected = null;
	
	
	@Override
	public void select(int i)
	{
		
	}
	
	@Override
	public void add(E e)
	{
		
	}
	
	@Override
	public boolean someSelected()
	{
		return this.selected != null;
	}
	
	@Override
	public int getIndexSelected()
	{
		return 0;
	}
	
	@Override
	public void next()
	{
		
	}
	
	@Override
	public void previous()
	{
		
	}
	
	@Override
	public void remove()
	{
		
	}
	
	@Override
	public E getSelected()
	{
		return null;
	}
	
	@Override
	public int size() 
	{
		return 0;
	}
	
	@Override
	public Iterator<E> iterator()
	{
		return null;
	}
	
	@Override
	public E get(int i)
	{
		return null;
	}

	@Override
	public void moveUp(int i)
	{
		
	}

	
	
}
