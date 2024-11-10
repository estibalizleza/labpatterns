package iterator;

import java.util.Comparator;
import domain.Symptom;

public class ComSymptomName implements Comparator<Symptom> {

	@Override
	public int compare(Symptom o1, Symptom o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
