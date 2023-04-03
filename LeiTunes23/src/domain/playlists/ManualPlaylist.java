package domain.playlists;

import domain.core.MusicLibrary;
import domain.core.SongLibraryEvent;


public class ManualPlaylist extends AbsPlaylist implements Playlist
{

	public ManualPlaylist(String name, MusicLibrary library)
	{
		super();
		this.name = name;
		this.library = library;
	}
	
    @Override
    public void processEvent(SongLibraryEvent e)
    {
    	String nome = e.getClass().getName();
    	
    	switch(nome)
    	{
    		case "SongAddedLibraryEvent":
    			this.library = super.library;
    			this.name = super.name;
    			this.selected = super.selected;
    			break;
    			
    		case "SongRatedLibraryEvent":
    			break;
    			
    		case "SongRemovedLibraryEvent:":
    			break;
    	}
    }
	

	
}
