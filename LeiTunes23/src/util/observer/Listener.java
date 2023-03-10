package util.observer;

/**
 * @author antonialopes
 * 
 * @param <E>
 * 
 * A listener of some sort of events
 */
public interface Listener<E extends Event> {
	
	/**
	 * Processes the given event 
	 * 
	 * @param e the event to process
	 */
	public void processEvent(E e);
	
}
