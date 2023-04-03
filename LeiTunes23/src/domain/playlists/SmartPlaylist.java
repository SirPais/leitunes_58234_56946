package domain.playlists;

import domain.core.*;
import domain.facade.ISong;

public abstract class SmartPlaylist extends AbsPlaylist 
{
	

	public SmartPlaylist(String name, MusicLibrary library)
	{
		super();
		this.name = name;
		this.library = library;
	}
	
	
	protected void AddAutomatic(ISong song) 
	{
        this.library.add((Song) song);
    }
    
    
    protected void removeAutomatic(int index) 
    {
    	
    	ISong previous_song = this.getSelected();
    	this.select(index);
        this.remove();
        
        int contador = 0;
        
        for (Song s : this.library.getSongs())
        {
        	if(s.equals(previous_song))
        	{
        		this.select(contador);
        		break;
        	}
        	else
        	{
        		contador++;
        	}
        	
        }
             
    }
    
    
    @Override
    public boolean add(ISong song) 
    {
    	
    	System.out.println("0 PERMISSAO");
    	return false;
   
    }
    
    @Override
    public boolean remove() 
    {
    	
    	System.out.println("0 PERMISSAO");
    	return false;
   
    }
    
    @Override
    public boolean moveUpSelected(int i) 
    {
    	
    	System.out.println("0 PERMISSAO");
    	return false;
   
    }

	
	
}
