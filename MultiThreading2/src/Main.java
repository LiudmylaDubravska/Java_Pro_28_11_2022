public class Main {
    public static void main(String[] args) {
        ThreadSafeList threadSafeList = new ThreadSafeList();
        String str1 = "String 1";
        String str2 = "String 2";
        String str3 = "String 3";
        threadSafeList.add(str1);
        threadSafeList.add(str2);
        threadSafeList.add(str3);
        System.out.println(threadSafeList);
        threadSafeList.get(1);
        threadSafeList.remove(1);
        System.out.println(threadSafeList);
        System.out.println("==========================");

        PetrolStation petrolStation = new PetrolStation(1000);
        Thread tr1 = new Thread(() -> {

            boolean isOk = petrolStation.doRefuel(40);
            System.out.println("Result of 40 litters refuel is " + isOk);
        });
        tr1.start();
        Thread tr2 = new Thread(() -> {
            boolean isOk = petrolStation.doRefuel(50);
            System.out.println("Result of 50 litters refuel is " + isOk);
        });
        tr2.start();
        Thread tr3 = new Thread(() -> {
            boolean isOk = petrolStation.doRefuel(20);
            System.out.println("Result of 20 litters refuel is " + isOk);
        });
        tr3.start();
        Thread tr4 = new Thread(() -> {
            boolean isOk = petrolStation.doRefuel(35);
            System.out.println("Result of 35 litters refuel is " + isOk);
        });
        tr4.start();
        Thread tr5 = new Thread(() -> {
            boolean isOk = petrolStation.doRefuel(77);
            System.out.println("Result of 77 litters refuel is " + isOk);
        });
        tr5.start();
    }
}
