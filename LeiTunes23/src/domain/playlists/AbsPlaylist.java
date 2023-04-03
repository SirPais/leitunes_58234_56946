package domain.playlists;

import domain.facade.ISong;

import java.beans.PropertyChangeEvent;
import java.util.Iterator;

import domain.core.*;

public abstract class AbsPlaylist implements Playlist 
{
	MusicLibrary library = null;
	String name = null;
	Song selected = null;
	Song playing = null;

	
    @Override
    public int size() 
    {
       return this.library.size();
    }

    @Override
    public ISong getSelected() 
    {
        return this.library.getSelected();
    }

    @Override
    public boolean someSelected() 
    {
        return (selected != null);
    }

    @Override
    public boolean add(ISong song) 
    {
    	
    	Iterable<Song> iter = library.getSongs();
    	
    	for (Song s : iter)
    	{
    		if(s != null)
    		{
    			if(s.equals(song))
    			{
    				return false;
    			}
    		}
    		
    		
    	}
    	
    	this.library.add((Song)song);
    	return true;
    }
    
    @Override
    public boolean remove()
    {
    	Iterable<Song> iter = library.getSongs();
    	
    	for (Song s : iter)
    	{
    		if(s.equals(this.getSelected()))
    		{
    			library.remove();
    			return true;
    		}
    	}
    	
    	return false;
    }

    @Override
    public void select(int i) 
    {
    	this.selected = this.library.get(i);
    	this.library.select(i);
    }

    @Override
    public boolean moveUpSelected(int i) 
    {
    	
    	if(i > this.size())
    	{
    		return false;
    	}
    	if(selected == null)
    	{
    		return false;
    	}
    	
    	this.library.moveUp(i);
    	return true;
    	
    }
     
    @Override
    public int getIndexSelected()
    {
    	return this.library.getIndexSelected();
    }
    
    @Override
    public void next()
    {
    	this.library.next();
    }
    
    @Override
    public void previous()
    {
    	this.library.previous();
    }
    
    @Override
    public void stop()
    {
    	this.library.stop();
    }
    
    @Override
    public void play()
    {
    	this.library.play();
    }
    
    
    
    @Override
    public String getName() 
    {
        return this.name;
    }
    
    @Override
    public boolean isPlaying()
    {
    	return this.isPlaying();
    }
    
	@Override
	public Iterator<ISong> iterator()
	{
		return null;
	}
    

    
    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
    	
    }
    
    @Override
    public void processEvent(SongLibraryEvent e)
    {
    	String nome = e.getClass().getName();
    	
    	switch(nome)
    	{
    		case "SongAddedLibraryEvent":
    			break;
    			
    		case "SongRatedLibraryEvent":
    			break;
    			
    		case "SongRemovedLibraryEvent:":
    			break;
    	}
    }
    
    /////////////////////////////////////////////////////////////
    @Override
    public String toString()
    {
   
    	return "*-- Playlist " + name + "--*\n" + library.toString();
    	
    }
    
    
    
}