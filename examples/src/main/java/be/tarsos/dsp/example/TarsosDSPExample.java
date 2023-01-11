package be.tarsos.dsp.example;

public abstract class TarsosDSPExample {
	
	public abstract String name();

	public String description(){
		return name();
	}

	public abstract void start(String... args);

	public boolean hasGUI(){
		return true;
	}
}
