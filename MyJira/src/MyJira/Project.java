package MyJira;
import java.util.Arrays;
import java.util.Objects;

public class Project {
	private String name;
	private Task[] backlog;
	private Dev[] team;
	
	public static void main(String[] args) {
		Project p = new Project();
		Dev danis = new Dev("Danis", "tudo");
		System.out.println(danis.getName());
		Task[] backlog = new Task[];
		Dev[] team = new Dev[];
	}
	
	
	public Project() {
	}
	
	public void registerTask(String nome, int time) {
		
	}
	
	public void registerDev(String name, String team) {
		
	}
	
	public boolean assignTaskDev(String t, String d) {
		
	}
	
	public void finishTask(String name) {
		
	}
	
	public String listDevs() {
		
	}
	
	public String listTasksDev(String nome) {
		
	}
	
	public String report() {
		
	}
}
