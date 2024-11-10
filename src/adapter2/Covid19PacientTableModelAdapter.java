package adapter2;

import java.util.Iterator;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames = new String[] { "Symptom", "Weight" };

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient = p;
	}

	public int getColumnCount() {
		// Challenge!
		return columnNames.length;
	}

	public String getColumnName(int i) {
		// Challenge!
		return columnNames[i];
	}

	public int getRowCount() {
		// Challenge!
		return pacient.getSymptoms().size();
	}

	public Object getValueAt(int row, int col) {
		// Challenge!
		Iterator<Symptom> it = pacient.getSymptoms().iterator();
		Symptom element = null;
		int currentRow = 0;
		while (it.hasNext()) {
			element = it.next();
			if (currentRow == row)
				break;
			currentRow++;
		}
		if (element != null) {
			switch (col) {
			case 0: 
				return element.getName();
			case 1: 
				return pacient.getWeight(element);
			default:
				return null;
			}
		}
		return null;

	}
}
