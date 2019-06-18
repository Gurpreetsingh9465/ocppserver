package ocpp.baseclasses;

import ocpp.essential.Status;
import ocpp.essential.Type;

public class Reset{
    /*req()*/
    Type.Reset type; //Required. This contains the type of reset that the Charge Point should perform.

    /*conf()*/
    Status.Reset status; //Required. This indicates whether the Charge Point is able to perform the reset.

    /*default constructor*/
    Reset(){
        type = Type.Reset.Soft;
        status = Status.Reset.Accepted;
    }

    public Reset(ocpp.essential.Type.Reset type, ocpp.essential.Status.Reset status) {
		super();
		this.type = type;
		this.status = status;
	}

	/*Parameterized constructor*/
    

    int req(){
        /*
        do{
            conf();
        }while(status==0); //keep sending request till confirmed.
        */
        return 0;
    }
    int conf(){
        /*
        if( type == 1){
            status = 1; //accepted
        }
        else{
            //else if reset type is hard..it will accept it after sending apt messages.
            if(type == 1){
                //sending messages.
                status = 1;
                //and then reboot using BootNotification.req
            }
            else { //soft reset
                //if StopTransaction.req isn't confirmed.
                status = 0; //rejected
                //otherwise it is accepted
                status = 1;
                //and then reboot using BootNotification.req
            }
        }
        */
        return 0;
    }
}