/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Test {
    public static void main (String args[]) {
            
        Player a=new Player("001","Priti");Player b=new Player("002","Laitha");Player c=new Player("003","Sam");
        Player d=new Player("004","Vandana");Player e=new Player("005","Subi");
        Game game=new Game("UNO-001");
        game.CreateNewGame();//create a new deck
        game.addplayer(a);game.addplayer(b);game.addplayer(c);//add players
        game.addplayer(d);game.addplayer(e);
        game.StartGame();//discard a card and send start cards for players
        game.showGameInformation();
        }
    
}
