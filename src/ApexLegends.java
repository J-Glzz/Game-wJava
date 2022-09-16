public class ApexLegends {
    public static void main(String[] args) throws InterruptedException{
        TestWraith();
        TestHorizon();
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
}
