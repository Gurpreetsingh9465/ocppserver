package ocpp.essential;

public class ChargingSchedulePeriod {
	int startPeriod; /*Required. Start of the period, in seconds from the start of schedule. The value of StartPeriod
    also defines the stop time of the previous period.*/

	float limit; /*Required. Power limit during the schedule period, expressed in Amperes. Accepts at most one digit
				 fraction(e.g. 8.1).*/

	int numberPhases; /*Optional. The number of phases that can be used for charging. If a number of phases is needed,
   				 numberPhases=3 will be assumed unless another number is given.*/

	/*default constructor*/
	ChargingSchedulePeriod(){
		startPeriod = 0;
		limit = 0.0f;
		numberPhases = 0;
	}
	
	/*parameterized constructor*/
	public ChargingSchedulePeriod(int startPeriod, float limit, int numberPhases) {
		this.startPeriod = startPeriod;
		this.limit = limit;
		this.numberPhases = numberPhases;
	}	
	/*getter and setter*/
    public int getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(int startPeriod) {
        this.startPeriod = startPeriod;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public int getNumberPhases() {
        return numberPhases;
    }

    public void setNumberPhases(int numberPhases) {
        this.numberPhases = numberPhases;
    }
}