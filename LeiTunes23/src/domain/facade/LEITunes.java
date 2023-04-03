package domain.facade;

import domain.core.MusicLibrary;
import domain.playlists.PlaylistList;

public class LEITunes 
{

	MusicLibraryController musicController = null;
	PlaylistListController playlistController = null;
	
	public LEITunes ()
	{
		this.musicController = new MusicLibraryController(new MusicLibrary());
		this.playlistController = new PlaylistListController();
		
	}
	
	public MusicLibraryController getMusicLibraryController()
	{
		return musicController;
	}
	
	public PlaylistListController getPlaylistController()
	{
		return playlistController;
	}
	
}
