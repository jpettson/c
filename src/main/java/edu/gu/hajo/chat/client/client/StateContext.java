package edu.gu.hajo.chat.client.client;

import java.lang.Thread.State;
import java.rmi.RemoteException;

import edu.gu.hajo.chat.server.spec.IChatClient;
import edu.gu.hajo.chat.server.spec.IMessage;
import edu.gu.hajo.chat.server.spec.IPeer;

/**
 * Handles the states and transitions between them
 *
 * @author hajo
 *
 */


// 
final class StateContext implements IState{

	private IState state;

	public enum State{
		Connected,
		Disconnected;
	}
	
	public StateContext(IState state) {
		this.state = state;
	}
	
	public void setState(IState state) {
		this.state = state;
	}

	@Override
	public void connectToServer(IChatClient client) throws RemoteException {
		// TODO
		
	}

	@Override
	public void disconnectFromServer(IChatClient client) throws RemoteException {
		// TODO 
		
	}

	@Override
	public State getState() {
		// TODO
		return null;
	}

	@Override
	public void broadcast(IMessage msg) throws RemoteException {
		// TODO 
		
	}

	@Override
	public IPeer searchFor(String username) throws RemoteException {
		// TODO 
		return null;
	}

}