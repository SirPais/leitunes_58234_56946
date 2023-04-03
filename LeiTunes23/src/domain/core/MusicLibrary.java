package domain.core;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;

import domain.facade.ISong;
import util.adts.AbsQListWithSelection;
import util.adts.ArrayQListWithSelection;
import util.adts.QListWithSelection;
import util.observer.Listener;
import util.observer.Subject;

public class MusicLibrary extends AbsQListWithSelection<Song> implements QListWithSelection<Song> , Subject<SongLibraryEvent>, PropertyChangeListener
{
    ISong playingSong = null;
    boolean playing = false;
    QListWithSelection<Song> queue = new ArrayQListWithSelection<Song>();
    

    
    
    public void play()
    {
    	this.playingSong = this.queue.getSelected();
    	this.playing = true;
    }
    
    //por fazer
    public boolean isPlaying()
    {
    	
    	if(!this.playing)
    	{
    		return false;
    	}
    	
    	Iterator<Song> iter = this.queue.iterator();
    	
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
    
    public Iterable<Song> getSongs()
    {
        return queue;
    }

    //////////////////////////////////////////////////
    /////IMPLEMENTAÇÕES DE ABS_QLISTWITHSELECTION/////
    /////////////////////////////////////////////////
    
    
    @Override
    public Song getSelected()
    {
    	return this.queue.getSelected();
    }
    
    @Override
    public int size()
    {
    	return this.queue.size();
    }

    @Override
    public void add(Song song)
    {
    	this.queue.add(song);
    }

    @Override
    public void remove()
    {
    	this.queue.remove();
    }
    
    @Override
    public void select (int i)
    {
    	this.queue.select(i);
    }
    
    @Override
    public void moveUp(int i)
    {
    	this.queue.moveUp(i);
    }
    
    @Override
    public int getIndexSelected()
    {
    	return queue.getIndexSelected();
    }
    
    @Override
    public void next()
    {
    	this.queue.next();
    }
    
    @Override
    public void previous()
    {
    	this.queue.previous();
    }
    
    
    /////////////////////////////////////////////////

    //POR FAZER
    
    ////////////////////////////////////////////////////
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitEvent(SongLibraryEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerListener(Listener<SongLibraryEvent> obs) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterListener(Listener<SongLibraryEvent> obs) 
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("*****MUSIC LIBRARY****\n");
        int index = 0;
        if (this.size() > 0)
        {
        	for (Song music : queue) {
                resultado.append(index + "-" + music.toString() + "\n");
                index++;
            }
        }
        
        return resultado.toString();
    }

    
}
