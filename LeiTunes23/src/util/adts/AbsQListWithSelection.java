package util.adts;

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
	
	
	// Construtor da Classe Abstrata
	public AbsQListWithSelection()
	{
		
	}
	
	
	
	// Devolve o elemento selecionado
	@Override
	public E getSelected() 
	{
		return selected;
	}
	
	
	
	
	
	
}
