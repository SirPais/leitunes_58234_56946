package domain.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;

import domain.core.MusicLibrary;
import domain.core.Song;
import domain.core.SongMetaInfo;

public class MusicLibraryController {

	MusicLibrary library = null;
	
	
	public MusicLibraryController()
	{
		this.library = new MusicLibrary();
	}
	
	public MusicLibraryController(MusicLibrary library)
	{
		this.library = library;
	}
	
	
	public int numberOfSongs()
	{
		return this.library.size();
	}
	
	
	public void play()
	{
		if(library.getSelected() != null)
		{
			this.library.play();
			this.library.getSelected().incTimesPlayed();
		}
	}
	
	public void addSong(String filename) throws Exception
	{
	     try 
	     {
	    	Mp3File file = new Mp3File (filename);
	    	if(file.hasId3v1Tag())
	    	{
	    		library.add(createSongId(file.getId3v1Tag(), filename));
	    	}else if(file.hasId3v2Tag())
	    	{
	    		library.add(createSongId(file.getId3v2Tag(), filename));
	    	}
	    	
	    
	    	
	    	
	     }
	     catch (Exception e)
	     {
	    	 
	     }
		

    }
		
	
	
	public void selectSong(int i)
	{
		if(this.numberOfSongs() > 0)
		{
			this.library.select(i);
		}
		
	}
	
	
	public void stop()
	{
		this.library.stop();
	}
	
	public void removeSelectedSong()
	{
		this.library.remove();
	}
	

	public Iterable<ISong> getMatches(String nome)
	{
		return null;
	}

	
	
	public Optional<ISong> getSelectedSong()
	{
		return Optional.ofNullable(this.library.getSelected());
	}


	public void incRateSelected() 
	{
		this.library.getSelected().incRating();
	}
	
	public void decRateSelected() 
	{
		this.library.getSelected().decRating();
	}
	
	private Song createSongId(ID3v1 id, String name)
	{
		String titulo = id.getTitle();
		if(titulo == null)
		{
			titulo = "unknown";
		}
		String genero = id.getGenreDescription();
		List<String> artistas = new ArrayList<String>();
		artistas.add(id.getArtist());
		String alabum = id.getAlbum();

		
		return new Song(new SongMetaInfo(titulo, artistas, genero, alabum), name);
	}
	
	private Song createSongId(ID3v2 id, String name)
	{
		String titulo = id.getTitle();
		if(titulo == null)
		{
			titulo = "unknown";
		}
		String genero = id.getGenreDescription();
		List<String> artistas = new ArrayList<String>();
		artistas.add(id.getArtist());
		String alabum = id.getAlbum();
		
		
		return new Song(new SongMetaInfo(titulo, artistas, genero, alabum), name);
	}
	
	@Override
	public String toString()
	{
		return this.library.toString();
	}
	
	
}
