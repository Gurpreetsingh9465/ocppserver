package ocpp.baseclasses;

import java.util.logging.Level;
import java.util.logging.Logger;

import ocpp.essential.IdTagInfo;

public class Authorize {

	private static final Logger LOGGER = Logger.getLogger(Authorize.class.getName());
    /*req()*/
    String idTag;	//Required. Contains identifier that needs to be identified. Length < 20.

    /*conf()*/
    IdTagInfo idTagInfo; //Required. Contains info about authorization status,expiry and parentID.
    
    /*default constructor*/
    Authorize() {
        idTag = "";
        idTagInfo = new IdTagInfo();
    }

	/*parameterized constructor*/
	public Authorize(String idTag, IdTagInfo idTagInfo) {
		super();
		this.idTag = idTag;
		this.idTagInfo = idTagInfo;
	}

    

    int req() {
        try{
            boolean accepted = conf();

            if (!accepted) {
                LOGGER.log(Level.SEVERE,"Error, ID Not found"); //or is it double logging?
                return 1;
            } else {
                /*Add entry to local authorization cache and proceed*/
                return 0;
            }

        }
        catch(Exception e){
            LOGGER.log(Level.SEVERE,"Error ",e);
            return 1;
        }
    }

    boolean conf(){
        boolean idPresent = false;
        try{
            /*Check database for idTagInfo*/
            return idPresent;
        }
        catch(Exception e){
            LOGGER.log(Level.SEVERE, "Error ",e);
            return false;
        }
    }

	public String getIdTag() {
		return idTag;
	}

	public void setIdTag(String idTag) {
		this.idTag = idTag;
	}

	public IdTagInfo getIdTagInfo() {
		return idTagInfo;
	}

	public void setIdTagInfo(IdTagInfo idTagInfo) {
		this.idTagInfo = idTagInfo;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}