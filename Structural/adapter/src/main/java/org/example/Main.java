package org.example;

import org.example.adapters.SquarePegAdapter;
import org.example.round.RoundHole;
import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(6);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.printf("Round peg r%.2f fits round hole r%.2f%n", rpeg.getRadius(),hole.getRadius());
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.printf("Square peg w%.2f fits round hole r%.2f%n", smallSqPeg.getWidth(), hole.getRadius());
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.printf("Square peg w%.2f does not fit into round hole r%.2f%n", largeSqPeg.getWidth(), hole.getRadius());
        }
    }
}