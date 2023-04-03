package domain.playlists;


import domain.core.*;
import util.adts.*;

public class PlaylistList extends AbsQListWithSelection<Playlist> implements QListWithSelection<Playlist>
{
	
	Playlist selectedList = null;
	
	QListWithSelection<Playlist> lists = new ArrayQListWithSelection<Playlist>();
	
	
	public PlaylistList(MusicLibrary library)
	{
		this.lists.add(new MostLikedSongsPlaylist(library));
		this.lists.add(new MostRecentlyAddedSongsPlaylist(library));
	}
	
	
	public void play()
	{
		selectedList.play();
	}
	
	public boolean isPlaying()
	{
		for (Playlist p : lists)
		{
			if(p.isPlaying())
			{
				return true;
			}
		}
		return false;
	}
	
	public void stop()
	{
		this.selectedList.stop();
	}

	@Override
	public void add(Playlist list)
	{
		this.lists.add(list);
	}

	@Override
	public Playlist getSelected()
	{
		return this.selectedList;
	}
	
	@Override
	public void select(int i)
	{
		this.selectedList = lists.get(i);
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("***** PLAYLISTS *****\n");
		int index = 0;
		for(Playlist lista : this.lists)
		{
			sb.append(index + " - " + lista.toString());
			index++;
		}
		
		return sb.toString();
	}
	
	
	
		
}
