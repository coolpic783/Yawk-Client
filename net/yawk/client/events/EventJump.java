package net.yawk.client.events;

import com.darkmagician6.eventapi.events.callables.EventCancellable;

public class EventJump extends EventCancellable{
	
	public byte type;
	
	public EventJump(byte type) {
		super();
		this.type = type;
	}
	
}
