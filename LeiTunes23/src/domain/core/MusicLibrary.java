package domain.core;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;

import domain.facade.ISong;
import util.adts.AbsQListWithSelection;
import util.adts.ArrayQListWithSelection;
import util.adts.QListWithSelection;
import util.observer.Listener;
import util.observer.Subject;

public class MusicLibrary extends AbsQListWithSelection<ISong> implements QListWithSelection<ISong> , Subject<SongLibraryEvent>, PropertyChangeListener
{
    ISong playingSong = null;
    boolean playing = false;
    QListWithSelection<ISong> queue = new ArrayQListWithSelection<ISong>();
    

    
    
    public void play()
    {
    	this.playingSong = (Song) this.queue.getSelected();
    	this.playing = true;
    }
    
    //por fazer
    public boolean isPlaying()
    {
    	
    	if(!this.playing)
    	{
    		return false;
    	}
    	
    	Iterator<ISong> iter = this.queue.iterator();
    	
    	while(iter.hasNext())
    	{
    		ISong s = iter.next();
    		
    		if(s.equals(playingSong))
    		{
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public void stop()
    {
        this.playing = false;
    }
    
    public void inRateSelected()
    {
        playingSong.incRating();
    }
    
    public void decRateSelected()
    {
        playingSong.decRating();
    }
    
    //////////////////////////////////////////////////
    //POR FAZER
    public Iterable<ISong> getMatches(String reexp)
    {
        return null;
    }
    
    public Iterable<ISong> getSongs()
    {
        return queue;
    }
    

    
    /////////////////////////////////////////////////

    //POR FAZER
    
    ////////////////////////////////////////////////////
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitEvent(SongLibraryEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerListener(Listener<SongLibraryEvent> obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterListener(Listener<SongLibraryEvent> obs) {
		// TODO Auto-generated method stub
		
	}

    
}
