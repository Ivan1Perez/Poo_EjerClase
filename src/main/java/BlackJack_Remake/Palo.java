package BlackJack_Remake;

import static com.diogonunes.jcolor.Ansi.colorize;

public enum Palo {

    HEART("♥", Color.RED),
    SPADE("♠", Color.BLACK),
    DIAMOND("♦", Color.RED),
    CLUB("♣", Color.BLACK);

    private String shape;
    private Color color;

    Palo(String shape, Color color){
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String toString(){
        return colorize(shape, color.getColor());
    }


}
