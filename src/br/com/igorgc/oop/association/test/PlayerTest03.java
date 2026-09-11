package br.com.igorgc.oop.association.test;

import br.com.igorgc.oop.association.domain.Player;
import br.com.igorgc.oop.association.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Cafú");
        Player player2 = new Player("Pelé");
        Team team = new Team("Brazil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("--- Player ---");

        player.print();

        System.out.println("--- Team ---");

        team.print();
    }
}
