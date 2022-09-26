public class Bangalore extends Legend implements BangaloreActionCallback {

    Bangalore(String name, String homeworld, int age){
        super(name, homeworld, age);
    }

    @Override
    public void smokeLauncher(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 21, Colors.RED);
        s.showImage("content/AbilitiesBangalore/TacticalAbility.png");
        s.setBounds(100, 100, 720, 480);
    }

    @Override
    public void doubleTime(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Arial", 18, Colors.blue);
        s.showImage("content/AbilitiesBangalore/PassiveAbility.png");
        s.setBounds(100,100, 720, 480);
    }

    @Override
    public void rollingThunder(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Arial", 18, Colors.MAGENTA);
        s.showImage("content/AbilitiesBangalore/UltimateAbility.png");
        s.setBounds(100, 100, 720, 480);
    }
}
