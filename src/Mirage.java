public class Mirage extends Legend implements MirageActionCallbacks{
    public Mirage(String name, String homeworld, int age) {
        super(name, homeworld, age);
    }

    @Override
    public void psycheOut(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 18, Colors.MAGENTA);
        s.showImage("content/AbilitiesMirage/TacticalAbility.png");
        s.setBounds(200, 100, 1080, 720);
    }

    @Override
    public void nowYouSeeMe(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 20, Colors.PINK);
        s.showImage("content/AbilitiesMirage/PassiveAbility.png");
        s.setBounds(100, 100, 1080, 720);
    }

    @Override
    public void lifeOfTheParty(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 16, Colors.RED);
        s.showImage("content/AbilitiesMirage/UltimateAbility.png");
        s.setBounds(150, 150, 720, 480);
    }
}
