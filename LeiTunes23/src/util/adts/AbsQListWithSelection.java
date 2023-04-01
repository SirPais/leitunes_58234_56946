package util.adts;

import java.util.Collections;
import java.util.Iterator;

/**
 * 
 * @author FC_56946 / FC_58234
 *
 * @param <E>
 */

public abstract class AbsQListWithSelection<E>  implements QListWithSelection<E>
{
	// Elemento selecionado
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
		return false;
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
	

	
	
}
