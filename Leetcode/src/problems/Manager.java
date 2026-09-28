package problems;

public class Manager extends Employee{
    private int teamSize;
    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize=teamSize;
    }
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.15;
    }


    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
