package ocpp.baseclasses;

import java.util.Date;

public class HeartBeat {
	/*no variables for req()*/

	//fields for conf function are...
	Date currentTime;

	/*parameterized constructor*/
	public HeartBeat(Date currentTime) {
		this.currentTime = currentTime;
	}

	int req(){
		//sends request to the central system that the connection  is alive...
		//while(alive){ send signal after a regular time interval,setting flag to avoiod repeated request in the same interval; }
		return 0;
	}

	Date conf(){
		//if(/*request received*/)
			currentTime = new Date();
			return currentTime;   /*current time to sync clock of central sysytem and station*/

	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}
}
