public class Wraith extends Legend implements WraithActionCallbacks{

    public Wraith(String name, String homeworld, int age) {
        super(name, homeworld, age);
    }

    @Override
    public void intoTheVoid(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.CYAN);
        s.showImage("content/AbilitiesWraith/tacticalWraith.png");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void voicesFromTheVoid(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.CYAN);
        s.showImage("content/AbilitiesWraith/pasiveWraith.png");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void dimensionalRift(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.CYAN);
        s.showImage("content/AbilitiesWraith/ultimateWraith.png");
        s.setBounds(200, 100, 1100, 900);
    }
}
