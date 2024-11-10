package iterator;

import java.util.Iterator;

import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator{
	private Covid19PacientIterator pacient;
	private int current;
	
	public Covid19PacientAdapter(Covid19PacientIterator p) {
		this.pacient = p;
		this.current = 0;
	}
	
	@Override
	public Object previous() {
		if(this.hasPrevious()) {
			return pacient.symptoms.get(pacient.position);
		}
		return null;
	}

	@Override
	public boolean hasPrevious() {
		return pacient.position>0;
	}

	@Override
	public void goLast() {
		pacient.position = pacient.symptoms.size()-1;
	}

}
