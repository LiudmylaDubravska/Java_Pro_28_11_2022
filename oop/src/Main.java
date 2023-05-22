public class Main {
    public static void main (String[] args) {
        Human man1 = CreateHuman("укр");
        Human man2 = CreateHuman("se");
        man1.eat();
        man2.sleep();
        man1.run();
        man2.run();
    }

        private static Human CreateHuman(String nationality){
            if (nationality.equals("укр")){
                return new UkrainimanMan();
            }  else if (nationality.equals("se")){
                return new SwedishMan();
            }

            return null;
        }
}
