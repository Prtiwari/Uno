/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Card {
    private String color;
    private String Type;
    private int Score;

    public Card(String color, String Type, int Score, String image) {
        this.color = color;
        this.Type = Type;
        this.Score = Score;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Card{" + "color=" + color + ", Type=" + Type + ", Score=" + Score + ", image=" + image + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    private String image;
    
}
