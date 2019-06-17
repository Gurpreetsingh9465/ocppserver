package ocpp.essential;

public class SampledValue {

	enum ReadingContext {
		InterruptionBegin, InterruptionEnd, Other, sampleClock, SamplePeriodic, TransactionBegin, TransactionEnd, Trigger;
	}
	enum ValueFormat {
		Raw, SignedData;
	}
	enum UnitOfMeasure {
		Wh, kWh, varh, kvarh, W, kW, VA, kVA, var, kvar, A, V, Celsius, Fahrenheit, K, Percent;
	}
	enum Measurand {
		CurrentExport, CurrentImport, CurrentOffered, EnergyActiveExportRegister, EnergyActiveImportRegister;
	}
	enum Phase {
		L1, L2, L3, N, L1N, L2N, L3N, L1L2 , L2L3, L3L1;
	}
	enum Location {
		Body, Cable, EV, Inlet, Outlet;
	}

	String value;

	ReadingContext context;

	ValueFormat format;

	Measurand measurand;

	Phase phase;

	Location location;

	UnitOfMeasure unit;

	/*default constructor*/
	SampledValue(){
		value = "";
		context = ReadingContext.InterruptionBegin;
		format = ValueFormat.Raw;
		measurand = Measurand.CurrentExport;
		phase = Phase.L1;
		location = Location.Body;
		unit = UnitOfMeasure.W;
	}

	/*parameterized constructor*/

	public SampledValue(String value, ReadingContext context, ValueFormat format,
						Measurand measurand, Phase phase, Location location, UnitOfMeasure unit) {
		this.value = value;
		this.context = context;
		this.format = format;
		this.measurand = measurand;
		this.phase = phase;
		this.location = location;
		this.unit = unit;
	}

	/*getters and setters*/

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ReadingContext getContext() {
		return context;
	}

	public void setContext(ReadingContext context) {
		this.context = context;
	}

	public ValueFormat getFormat() {
		return format;
	}

	public void setFormat(ValueFormat format) {
		this.format = format;
	}

	public Measurand getMeasurand() {
		return measurand;
	}

	public void setMeasurand(Measurand measurand) {
		this.measurand = measurand;
	}

	public Phase getPhase() {
		return phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public UnitOfMeasure getUnit() {
		return unit;
	}

	public void setUnit(UnitOfMeasure unit) {
		this.unit = unit;
	}
}
