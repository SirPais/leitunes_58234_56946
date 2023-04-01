package domain.core;

import util.adts.*;
import java.util.List;
import domain.facade.*;

public class Song implements ISong, RegExpMatchable
{
	
	SongMetaInfo info = null;
	String fileName = null;
	Rate rating = null;
	int numTimesPlayed = 0;
	
	

	public Song(SongMetaInfo info, String fileName)
	{
		this.info = info;
		this.fileName = fileName;
		
	}
	
	
	@Override
	public void incTimesPlayed() 
	{
		this.numTimesPlayed ++;		
	}

	@Override
	public int getTimesPlayed() 
	{		
		return this.numTimesPlayed;
	}

	@Override
	public Rate getRating() 
	{
		return this.rating;
	}

	@Override
	public void incRating() 
	{
		this.rating.increase();
	}

	@Override
	public void decRating()
	{
		this.rating.decrease();
	}

	@Override
	public String getSongTitle() 
	{
		return this.info.title();
	}

	@Override
	public String getGenre() 
	{
		return this.info.genre();
	}

	@Override
	public List<String> getArtists()
	{

		return this.info.artists();
	}

	@Override
	public String getAlbum() 
	{
		return this.info.album();
	}

	@Override
	public String getFilename() 
	{
		return this.fileName;
	}

	@Override
	public boolean matches(String regexp)
	{
		return this.info.matches(regexp);
	}

	
	
	
	
}
