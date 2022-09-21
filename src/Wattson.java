public class Wattson extends Legend implements WattsonActionCallbacks{

    public Wattson(String name, String homeworld, int age) {
        super(name, homeworld, age);
    }


    @Override
    public void perimeterSecurity(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BLUE);
        s.showImage("content/AbilitiesWattson/TacticalAbility.png");
        s.setBounds(200, 100, 1080, 720);
    }

    @Override
    public void sparkOfGenius(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.orange);
        s.showImage("content/AbilitiesWattson/PassiveAbility.png");
        s.setBounds(200, 100, 1080, 720);
    }

    @Override
    public void interceptionPylon(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 24, Colors.GREEN);
        s.showImage("content/AbilitiesWattson/UltimateAbility.png");
        s.setBounds(200, 100, 1080, 720);
    }
}
