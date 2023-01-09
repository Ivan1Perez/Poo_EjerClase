package BlackJack_Remake;

import com.diogonunes.jcolor.Attribute;

public enum Color {

    RED(Attribute.RED_TEXT()),
    BLACK(Attribute.BLACK_TEXT());

    Attribute color;

    Color(Attribute color){
        this.color = color;
    }

    public Attribute getColor(){
        return color;
    }

}
