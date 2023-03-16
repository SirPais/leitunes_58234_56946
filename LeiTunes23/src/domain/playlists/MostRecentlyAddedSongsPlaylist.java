package domain.playlists;

import java.beans.PropertyChangeEvent;
import java.util.Iterator;

import domain.core.SongLibraryEvent;
import domain.core.MusicLibrary;
import domain.facade.ISong;

public class MostRecentlyAddedSongsPlaylist extends SmartPlaylist
{
	
	public MostRecentlyAddedSongsPlaylist(MusicLibrary library)
	{
		
	}
	
	@Override
	public int size()
	{
		return 0;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		
	}
	
	@Override
	public void stop()
	{
		
	}
	
	@Override
	public String getName()
	{
		return null;
	}
	
	@Override
	public boolean isPlaying()
	{
		return false;
	}
	
	@Override
	public boolean remove()
	{
		return false;
	}
	
	@Override
	public boolean add(ISong song)
	{
		return false;
	}
	
	@Override
	public int getIndexSelected()
	{
		return 0;
	}
	
	@Override
	public boolean moveUpSelected(int i)
	{
		return false;
	}
	
	@Override
	public ISong getSelected()
	{
		return null;
	}
	
	@Override
	public void previous()
	{
		
	}
	
	@Override
	public Iterator<ISong> iterator()
	{
		return null;
	}
	
	@Override
	public void next()
	{
		
	}
	
	@Override
	public void play()
	{
		
	}
	
	@Override
	public void processEvent(SongLibraryEvent e)
	{
		
	}
	
	@Override
	public void select(int i)
	{
		
	}
	
	@Override
	public boolean someSelected()
	{
		return false;
	}
}
