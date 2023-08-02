package prepear_for_exam.Paskaitos.Paskaita_14_interfaice.interfaceTaskTwo;

public class Frigate implements IsSeaVessel {
    int displacement;
    String name;
    int maxPassengers;
    int maxSpeed;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String fireGun() {
        return "šūvis";
    }

    @Override
    public String launch() {
        return "paleidimas";
    }
}

