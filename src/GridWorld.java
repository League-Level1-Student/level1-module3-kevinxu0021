import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	public static void main(String[] args) {
		World world = new World();
		Flower flower = new Flower();
		Bug bug = new Bug();
		Bug bug1 = new Bug(Color.blue);
		Location location = new Location(5, 5);
		Location location1 = new Location(8, 9);

		world.show();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location location2 = new Location(i, j);
				Flower flower1 = new Flower();
				world.add(location2, flower);
			}
		}

		world.add(location, bug);
		world.add(location1, bug1);
		bug1.turn();
		bug1.turn();

	}

}
