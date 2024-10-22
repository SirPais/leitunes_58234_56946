package util.adts;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * 
 * @author FC_56946 / FC_58234
 *
 * @param <E>
 */


public class ArrayQListWithSelection<E> extends AbsQListWithSelection<E>
{
	
	//Lista de Elementos Selecionados
	ArrayList<E> objs = new ArrayList<E>();
	
	//Construtor de ArrayQListWithSelection
	public ArrayQListWithSelection()
	{
		super();
	}
	
	// Devolve o tamanho da QList
	@Override
	public int size() 
	{
		return this.objs.size();
	}

	// Recebe um inteiro, devolve o elemento E nessa posição
	// @Requires (i > 0) && (i < size)
	@Override
	public E get(int i) 
	{
		return (this.objs.get(i));
	}

	
	// Devolve a lista de musicas ma forma de um iterador
	@Override
	public Iterator<E> iterator() {
		return(this.objs.iterator());
	}
	
	// Recebe um numero inteiro, altera o elemento E selecionado para o elemento da lista no indice selecionado
	// @Requires (i > 0) && (i < size)
	
	@Override
	public void select(int i) 
	{
		if(this.size() > 0 && i <= this.size())
		{
			this.selected = this.get(i);
		}
		else
		{
			this.selected = null;
		}
	}

	
	// Adiciona um elemento e à lista
	// Seleciona o elemento adicionado
	
	@Override
	public void add(E e) 
	{
		this.objs.add(e);
		this.select(this.size() - 1);
		
	}

	// Devolve true se o elemento selecionado nao for nulo
	// Caso contrario devolve falso
	@Override
	public boolean someSelected() 
	{		
		return ( this.selected != null );				
	}
	
	// Devolve o indice do elemento selecionado na lista de elementos
	@Override
	public int getIndexSelected() 
	{
		return this.objs.indexOf(selected);
	}
	
	// Seleciona o elemento seguinte da queue, caso nao seja possivel coloca o elemento selecionado como nulo 
	@Override
	public void next() 
	{	
		select(this.objs.indexOf(selected) + 1);	
	}

	// Seleciona o elemento anterior da queue, caso nao seja possivel coloca o elemento selecionado como nulo 
	@Override
	public void previous() 
	{
		select(this.objs.indexOf(selected) - 1);	
	}

	// Apaga o elemento selecionado caso exista um elemento selecionado
	@Override
	public void remove() 
	{
		if(this.someSelected())
		{
			this.objs.remove(this.objs.indexOf(selected));
			
			this.previous();
					
		}
		
	}
	
	// Devolve o elemento selecionado
	@Override
	public E getSelected() 
	{
		return this.selected;
	}

	@Override
	public void moveUp(int i)
	{
		this.objs.remove(selected);	
		this.objs.add(i, selected);
	}
	
	

}
