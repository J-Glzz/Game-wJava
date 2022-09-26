public class ApexLegends {
    public static void main(String[] args) throws InterruptedException{
        TestWraith();
        TestHorizon();
        TestWattson();
        TestMirage();
    }
    private static void TestWraith(){
        Screen screen = new Screen();
        Wraith wraith = new Wraith(
                "Renee Blasey",
                "Typhon",
                32
        );
        Thread abilitiesWraith = new Thread(new Runnable() {
            @Override
            public void run(){
                try {
                    wraith.voicesFromTheVoid(screen);
                    Thread.sleep(3000);

                    wraith.intoTheVoid(screen);
                    Thread.sleep(3000);

                    wraith.dimensionalRift(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        });
        abilitiesWraith.start();
    }
    private static void TestHorizon() throws InterruptedException{
        Screen screen =  new Screen();
        Horizon horizon =  new Horizon(
                "Mary Somers",
                "Psmathe",
                37
        );
        Thread abilitiesHorizon =  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    horizon.spaceWalk(screen);
                    Thread.sleep(3000);

                    horizon.gravityLift(screen);
                    Thread.sleep(3000);

                    horizon.blackHole(screen);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        });
        abilitiesHorizon.start();
    }
    private static void TestWattson() throws InterruptedException{
         Screen screen = new Screen();
         Wattson wattson = new Wattson(
                 "Natalie Paquette",
                 "Solace",
                 22
         );
         Thread abilitiesWattson = new Thread(new Runnable() {
             @Override
             public void run() {
                 try{
                     wattson.perimeterSecurity(screen);
                     Thread.sleep(1500);

                     wattson.interceptionPylon(screen);
                     Thread.sleep(2000);

                     wattson.sparkOfGenius(screen);
                     Thread.sleep(2500);
                 }catch (InterruptedException ie){
                     ie.printStackTrace();
                 }

             }
         });
         abilitiesWattson.start();
    }
    private static void TestMirage() throws InterruptedException{
        Screen screen = new Screen();
        Mirage mirage = new Mirage(
                "Elliot Witt",
                "Solace",
                30
        );
        Thread abilitiesMirage = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    mirage.nowYouSeeMe(screen);
                    Thread.sleep(500);

                    mirage.lifeOfTheParty(screen);
                    Thread.sleep(1000);

                    mirage.psycheOut(screen);
                    Thread.sleep(1500);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        });
        abilitiesMirage.start();
    }
    private static void testBangalore() throws InterruptedException{
        Screen screen = new Screen();
        Bangalore bangalore = new Bangalore(
                "Anita Williams",
                "Gridiron",
                38
        );
        Thread abilitiesBangalore = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    bangalore.doubleTime(screen);
                    Thread.sleep(300);

                    bangalore.smokeLauncher(screen);
                    Thread.sleep(600);

                    bangalore.rollingThunder(screen);
                    Thread.sleep(900);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        });
    }
    private static void testCaustic() throws InterruptedException{
        Screen screen = new Screen();
        Caustic caustic = new Caustic(
                "Alexander Nox",
                "Gaea",
                48
        );
        Thread abilitiesCaustic = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    caustic.noxGasTrap(screen);
                    Thread.sleep(1000);

                    caustic.noxVision(screen);
                    Thread.sleep(2000);

                    caustic.noxGasGrenade(screen);
                    Thread.sleep(3000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        });
    }
}
