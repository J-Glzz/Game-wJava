public class Caustic extends Legend implements CausticActionCallback{
    Caustic(String name, String homeworld, int age){
        super(name, homeworld, age);
    }

    @Override
    public void noxGasTrap(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Arial", 14, Colors.BLACK);
        s.showImage("content/AbilitiesCaustic/TacticalAbility.png");
        s.setBounds(150,150, 720, 480);
    }

    @Override
    public void noxVision(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Arial", 18, Colors.PINK);
        s.showImage("content/AbilitiesCaustic/PassiveAbility.png");
        s.setBounds(180, 180, 720, 480);
    }

    @Override
    public void noxGasGrenade(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.setBounds(200, 200, 720, 480);
        s.out(showMessage(), "Arial", 20, Colors.MAGENTA);
        s.showImage("content/AbilitiesCaustic/UltimateAbility.png");

    }
}
