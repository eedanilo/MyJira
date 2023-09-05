package MyJira;
import java.util.Arrays;
import java.util.Objects;

public class Task {
	private String name;
	private int tempoEx;
	private boolean status;

	public Task(String nome, int tempo) {
		this.name = nome;
		this.tempoEx = tempo;
		this.status = false;
	}

	public String getNome() {
		return this.name;
	}

	public void setTime(int tempo) {
		this.tempoEx = tempo;
	}

	public int getTime() {
		return this.tempoEx;
	}

	public void setType(String t) {
		
	}

	public String getType() {

	}

	public boolean getStatus() {
		return this.status;
	}

	public void finish() {
		this.status = true;
	}

	public String listTaks() {
		
	}

	
	public String toString() {
		String tasks;
		String tasks = 
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, status, tempoEx);
	}


	
}
