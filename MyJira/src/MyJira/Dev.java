package MyJira;
import java.util.Arrays;
import java.util.Objects;

public class Dev {
	private String name;
	private String team;
	private Task[] myTasks = new Task[5];

	public Dev(String name, String team) {
		this.name = name;
		this.team = team;
	}
	
	

	public String getName() {
		return this.name;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return this.team;
	}

	public boolean acceptTask(Task newTask) {
		for (int i = 0; i<5; i++) {
			if(myTasks[i] != null) {
				this.myTasks[i] = newTask;
				return true;
			}
		}
		return false;
		
	}

	public void finishTask(String nameTask) {
		for (int j = 0; j < myTasks.length; j++) {
			if (myTasks[j].getNome().equals(nameTask)) {
				myTasks[j] = null;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(myTasks);
		result = prime * result + Objects.hash(name, team);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Arrays.equals(myTasks, other.myTasks) && Objects.equals(name, other.name)
				&& Objects.equals(team, other.team);
	}

	public String toString() {
		String tasks = "";
		for (int k = 0; k < myTasks.length; k++) {
			tasks += myTasks[k].getNome();
			if (k != myTasks.length - 1) {
				tasks += " ";
			}
		}	
		String dev = this.name + "/" + this.team + tasks; 
		return dev;
	}
}
