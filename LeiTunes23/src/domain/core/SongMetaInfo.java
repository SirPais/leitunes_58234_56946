package domain.core;

import util.adts.*;

import java.util.Arrays;
import java.util.List;



public record SongMetaInfo(String title, List<String> artists, String genre, String album) implements RegExpMatchable {



    @Override
    public boolean matches(String regexp) {
        return this.title().matches(regexp) || this.artists().stream().anyMatch(a -> a.matches(regexp))
                || this.genre().matches(regexp) || this.album().matches(regexp);
    }
    
    
    @Override
    public String toString()
    {
    	return "[" + title + ", " + album  + ", " + genre + ", " + artists + "]";
    }
    
    
    
}