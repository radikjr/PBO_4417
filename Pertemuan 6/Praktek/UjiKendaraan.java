/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class UjiKendaraan {
    public static void main(String[] args) {


        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle kendA = new MotorVehicle();
        MotorVehicle kendB = new MotorVehicle(2.0, "Black", 2, "H 2001 IQ");
        Car mobil = new Car();
        MotorVehicle motor = new MotorCycle(0.0, "White", 2, "H 1998 PW");

        System.out.println("================ Tes Praktikum 5 ===============");
        System.out.println("Kendaraan (Vehicle) tanpa parameter :");
        System.out.println(kendaraan.speed);
        System.out.println(kendaraan.color);
        System.out.println("Sepeta (Bicycle) tanpa parameter");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        System.out.println("Kendaraan Bermotor (MotorVehicle) dengan parameter");
        System.out.println(kendB.speed);
        System.out.println(kendB.color);
        System.out.println(kendB.getSizeOfEngine());
        System.out.println(kendB.getLicensePlate());

        System.out.println("================ Tes Praktikum 5 ================");
        
        System.out.println("Melajukan Kendaraan: ");
        KendaraanMelaju(kendaraan);

        System.out.println("Melajukan Sepeda: ");
        KendaraanMelaju(sepeda);

        System.out.println("Melajukan Kendaraan Bermotor 1: ");
        KendaraanMelaju(kendA);

        System.out.println("Melajukan Kendaraan Bermotor 2: ");
        KendaraanMelaju(kendB);

        System.out.println("Melajukan Mobil: ");
        KendaraanMelaju(mobil);

        System.out.println("Melajukan Motor: ");
        KendaraanMelaju(motor);

    }

    public static void KendaraanMelaju(Vehicle kendaraan){
        kendaraan.goStraight();
        System.out.println("Kecepatan baru : " +kendaraan.speed+" km / jam");
    }
}