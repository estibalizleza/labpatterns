package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {
	public static void main(String args[]) {
		Covid19Pacient pacient = new Covid19Pacient("aitor", 35);
		new PacientObserverGUI(pacient);
		new PacientSymptomGUI(pacient);
	}
}
