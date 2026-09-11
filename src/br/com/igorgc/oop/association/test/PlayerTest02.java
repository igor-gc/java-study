package br.com.igorgc.oop.association.test;

import br.com.igorgc.oop.association.domain.Player;
import br.com.igorgc.oop.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Brazil");

        player1.setTeam(team);

        player1.print();
    }
}
