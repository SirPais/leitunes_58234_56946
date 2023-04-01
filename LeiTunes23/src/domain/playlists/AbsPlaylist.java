package domain.playlists;

import java.util.*;

import domain.facade.ISong;

import domain.core.*;

public abstract class AbsPlaylist implements Playlist 
{
	MusicLibrary library = null;
	String name = null;
	ISong selected = null;
	ISong playing = null;
	
	
    @Override
    public int size() 
    {
        return library.size();
    }

    @Override
    public ISong getSelected() 
    {
        return selected;
    }

    @Override
    public boolean someSelected() 
    {
        return (selected != null);
    }

    @Override
    public boolean add(ISong song) 
    {
    	Iterator<ISong> iter = this.library.getSongs().iterator();
    	
    	while(iter.hasNext())
    	{
    		ISong s = iter.next();
    		
    		if (s.equals(song))
    		{
    			return false;
    		}
    		
    	}
    	
    	
    	return true;
        
    }

    @Override
    public void select(int i) 
    {
    	this.selected = this.library.get(i);
    }

    @Override
    public boolean moveUpSelected(int i) 
    {
    	
    	if(i > this.size())
    	{
    		return false;
    	}
    	if(!this.selected.equals(library.getSelected()))
    	{
    		return false;
    	}
  
   	
    	return true;
        
    }

    @Override
    public int getIndexSelected() 
    {
        return 0;
    }
        
    @Override
    public String getName() 
    {
        return this.name;
    }
    
    
}