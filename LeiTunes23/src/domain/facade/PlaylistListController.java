package domain.facade;

import java.util.Iterator;

import domain.core.MusicLibrary;
import domain.core.SongAddedLibraryEvent;
import domain.playlists.ManualPlaylist;
import domain.playlists.Playlist;
import domain.playlists.PlaylistList;

public class PlaylistListController{

	
	MusicLibrary library = null;
	PlaylistList list = null;
	
	public PlaylistListController()
	{
		library = new MusicLibrary();
		list = new PlaylistList(library);
	}
	
	
	public PlaylistListController(PlaylistList playlists, MusicLibrary library)
	{
		this.list = playlists;
		this.library = library;
	}
	
	
	public void createPlaylist(String name)
	{
		Playlist manual = new ManualPlaylist(name, library);
		list.add(manual);
	}
	
	public boolean somePlaylistSelected()
	{
		return this.list.someSelected();
	}
	
	
	public void selectPlaylist(int position)
	{
		this.list.select(position);
	}
	
	
	public Iterator<Playlist> iterator()
	{
		return this.list.iterator();
	}
	
	public Playlist getSelectedPlaylist()
	{
		return this.list.getSelected();
	}
	
	public void removePlaylist()
	{
		this.list.remove();
	}
	
	public int numberOfSongs()
	{
		return this.list.getSelected().size();
	}
	
	public void addSong()
	{
		this.list.getSelected().add(this.library.getSelected());
		this.list.getSelected().processEvent(new SongAddedLibraryEvent());
	}
	
	public void selectSong(int i)
	{
		this.getSelectedPlaylist().select(i);
	}
	
	public boolean someSongSelected()
	{
		if(!somePlaylistSelected())
		{
			return(this.getSelectedPlaylist().someSelected());
		}
		return false;
	}
	
	public void removeSelectedSong()
	{
		this.list.remove();
	}
	
	public void nextSong()
	{
		this.list.getSelected().next();
	}
	
	public void previousSong()
	{
		this.list.getSelected().previous();
	}
	
	public void play()
	{
		if(someSongSelected())
		{
			this.list.getSelected().play();
		}
	}
	
	public void stop()
	{
		this.list.getSelected().stop();
	}
	
	@Override
	public String toString()
	{
		return this.list.toString();
	}

	
	
	
	

}
