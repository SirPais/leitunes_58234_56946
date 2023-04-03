package domain.playlists;


import domain.core.MusicLibrary;


public class MostRecentlyAddedSongsPlaylist extends SmartPlaylist
{
	
	int max_size = 0;
	
	
	public MostRecentlyAddedSongsPlaylist(MusicLibrary library)
	{
		super("Most Recently Added Songs Playlist", library);
		this.max_size = library.size();
	}
	

}
