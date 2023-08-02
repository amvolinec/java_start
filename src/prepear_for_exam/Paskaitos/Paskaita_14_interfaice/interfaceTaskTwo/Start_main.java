package prepear_for_exam.Paskaitos.Paskaita_14_interfaice.interfaceTaskTwo;

import java.util.ArrayList;

public class Start_main {
    public static void main(String[] args) {
        Jeep mašina = new Jeep();
        System.out.println(mašina.drive());
        Hovercraft kažkas = new Hovercraft();
        System.out.println(kažkas.drive());
        System.out.println(kažkas.enterLand());
        Frigate kažkaskitoks = new Frigate();
        System.out.println(kažkaskitoks.fireGun());

        ArrayList<IsVehicle> sarasas = new ArrayList<>();
        sarasas.add(mašina);
        sarasas.add(kažkaskitoks);
        sarasas.add(kažkas);
        for (IsVehicle objektas : sarasas) {
            if (objektas instanceof IsVehicle) {
                System.out.println("Transporto priemonė");
                objektas.getMaxPassengers();
                objektas.getMaxSpeed();
                //  objektas.getNumWheels() negalima kviesti
            }

            if (objektas instanceof IsSeaVessel) {
                System.out.println("Vandens transporto priemonė");
                IsSeaVessel transportas = (IsSeaVessel) objektas;
                transportas.getDisplacement();
            }

            if (objektas instanceof IsLandVehicle) {
                IsLandVehicle priemonė = (IsLandVehicle) objektas;
                System.out.println("Sausumos transporto priemonė");
                priemonė.getNumWheels();
            }

            System.out.println("__________");
        }
    }
}

