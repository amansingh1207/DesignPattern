package SOLIDPrinciple.AnimalTrackerEx2;

public class MySQLDatabase implements AnimalRepo{
    public void save(String data){
        System.out.println("[MySQL] Saved: " + data);
    }
}
