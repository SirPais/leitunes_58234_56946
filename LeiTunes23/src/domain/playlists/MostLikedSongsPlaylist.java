package domain.playlists;


import domain.core.MusicLibrary;
import domain.facade.ISong;

import java.util.Iterator;

public class MostLikedSongsPlaylist extends SmartPlaylist
{
	int max_size = 0;
	
	public MostLikedSongsPlaylist(MusicLibrary library)
	{
		super("Most Liked Songs Playlist", library);
		this.max_size = library.size();
	}
	
	


	


	
	




}
