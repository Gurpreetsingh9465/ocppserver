package ocpp.baseclasses;

import ocpp.essential.Status;

public class ClearCache {
	//no variables defined for the req function..

	//variables for conf function...

	Status.ClearCache status;
	/*default constructor*/
	public ClearCache() {
		super();
	}
	/*parameterized constructor*/	
	public ClearCache(ocpp.essential.Status.ClearCache status) {
		this.status = status;
	}

	int req(){
		//central server requests to clear the cache....
		conf();
		return 0;
	}

	int conf(){
		//if(/*cache cleared*/)
		status = Status.ClearCache.Accepted;
		return 0;
	
	}
	public Status.ClearCache getStatus() {
		return status;
	}
}
