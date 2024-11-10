package iterator;

import java.util.Comparator;

import domain.Symptom;

public class ComSeverityIndex implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return ((domain.Symptom) o1).getSeverityIndex() - ((domain.Symptom) o2).getSeverityIndex();
	}

}
