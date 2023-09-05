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
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	public void finish() {
		this.status = true;
	}

	/**
	 * public String listTaks() {
	 */
		
	//}

	
	public String toString() {
		return "Tarefa: " + this.name + "Tempo: " + this.tempoEx + "Estado: " + (status ? "Finalizada" : "Em aberto"); 
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		Task task = (Task) o;
		return name.equals(task.name);
	}

	
}
