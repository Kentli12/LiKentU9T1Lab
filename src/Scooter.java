public class Scooter extends Vehicle{

    private String metal;

    public Scooter(String name, int wheels, String metal){
        super(name, wheels);
        this.metal = metal;
    }

    public String getMetal() {
        return metal;
    }

    public void flash(){
        System.out.println("Flash Flash, I am here");
    }
}
