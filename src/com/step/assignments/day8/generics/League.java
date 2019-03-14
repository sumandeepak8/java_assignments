package com.step.assignments.day8.generics;

import java.util.ArrayList;
import java.util.List;

public class League<T> {
    private List leagueTable;

    public League() {
        this.leagueTable = new ArrayList();
    }

    public void addTeam(T team) {
        this.leagueTable.add(team);
    }

    public List<T> getTeams() {
        return this.leagueTable;
    }

    public static void main(String[] args) {
        Cricket bangloreChampians = new Cricket("banglore champians", 9);
        Cricket dehliDareDevils = new Cricket("Delhi Daredevils", 11);

        League<Cricket> league1 = new League<>();
        league1.addTeam(bangloreChampians);
        league1.addTeam(dehliDareDevils);

        Football firstFootball = new Football("First Football", 6);
        Football secondFootball = new Football("Second Football", 4);

        League<Football> league2 = new League<>();
        league2.addTeam(firstFootball);
        league2.addTeam(secondFootball);

        for (int i = 0; i < league1.getTeams().size(); i++) {
            System.out.println(league1.getTeams().get(i).getName() + league1.getTeams().get(i).getNoOfPlayers());
        }

        for (int i = 0; i < league2.getTeams().size(); i++) {
            System.out.println(league2.getTeams().get(i).getName() + league2.getTeams().get(i).getNoOfPlayers());
        }
    }
}
