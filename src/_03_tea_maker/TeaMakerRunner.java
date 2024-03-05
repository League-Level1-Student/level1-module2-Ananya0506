package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaMakerRunner {

	public static void main(String[] args) {
		TeaBag Mocha = new TeaBag("Mocha");
Mocha.getFlavor();

Kettle k = new Kettle();
k.getWater();
k.boil();

Cup cup = new Cup();
cup.makeTea(Mocha, k.getWater());


	}

}
