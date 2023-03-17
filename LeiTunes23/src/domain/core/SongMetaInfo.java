package domain.core;

import util.adts.*;
import java.util.List;
import java.util.regex.*;

public record SongMetaInfo(String title, String genre, List<String> artists, String album) implements RegExpMatchable
{

	//POR FAZER
	@Override
	public boolean matches(String regexp)
	{
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher_title = pattern.matcher(title);
		
		return (matcher_title.find());
	}
	
}
