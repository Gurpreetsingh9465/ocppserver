package ocpp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ocpp.essential.SampledValue.Location;
import ocpp.essential.SampledValue.Measurand;
import ocpp.essential.SampledValue.Phase;
import ocpp.essential.SampledValue.ReadingContext;
import ocpp.essential.SampledValue.UnitOfMeasure;
import ocpp.essential.SampledValue.ValueFormat;

@Entity
@Table(name="SampledValue")
public class SampledValue {

	@Override
	public String toString() {
		return "SampledValue [value=" + value + ", context=" + context + ", format=" + format + ", measurand="
				+ measurand + ", phase=" + phase + ", location=" + location + ", unit=" + unit + "]";
	}
	public SampledValue() {}
	public SampledValue(String value, ReadingContext context, ValueFormat format, Measurand measurand, Phase phase,
			Location location, UnitOfMeasure unit) {
		super();
		this.value = value;
		this.context = context;
		this.format = format;
		this.measurand = measurand;
		this.phase = phase;
		this.location = location;
		this.unit = unit;
	}

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

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Value")
	private String value;
	
	@Column(name = "Context")
	private ReadingContext context;
	
	@Column(name = "Format")
	private ValueFormat format;
	
	@Column(name = "Measurand")
	private Measurand measurand;
	
	@Column(name = "Phase")
	private Phase phase;
	
	@Column(name = "Location")
	private Location location;
	
	@Column(name = "Unit")
	private UnitOfMeasure unit;
}
