public class Horizon extends Legend implements HorizonActionCallback{

    public Horizon(String name, String homeWorld, int age) {
        super(name, homeWorld, age);
    }

    @Override
    public void gravityLift(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.CYAN);
        s.showImage("content/AbilitiesHorizon/TacticalAbility.png");
        s.setBounds(200, 200, 720, 480);
    }

    @Override
    public void spaceWalk(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.blue);
        s.showImage("content/AbilitiesHorizon/PassiveAbility.png");
        s.setBounds(200, 200, 720, 480);
    }

    @Override
    public void blackHole(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.blue);
        s.showImage("content/AbilitiesHorizon/UltimateAbility.png");
        s.setBounds(200, 200, 720, 480);
    }
}
