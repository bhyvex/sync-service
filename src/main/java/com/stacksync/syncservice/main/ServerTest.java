package com.stacksync.syncservice.main;


import org.apache.commons.daemon.DaemonContext;
import org.apache.commons.daemon.DaemonController;

import com.stacksync.syncservice.SyncServiceDaemon;

public class ServerTest {
	
	public static void main(String[] args) throws Exception  {
		
		SyncServiceDaemon daemon = new SyncServiceDaemon();
		try {
			DaemonContext dc = new DaemonContext() {
				
				@Override
				public DaemonController getController() {
					return null;
				}
				
				@Override
				public String[] getArguments() {
					return new String[]{"/home/lab144/NetBeansProjects/sync-service/config.properties"};
				}
			};
			
			daemon.init(dc);
			daemon.start();
		} catch (Exception e) {
			throw e;
		}
	}
}
