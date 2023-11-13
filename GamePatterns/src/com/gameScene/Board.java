package com.gameScene;

import java.util.List;

class Board {
    void render(List<Character> list) {
        System.out.println("Rendering Board:");

        for (Renderable renderable : list) {
            System.out.println(renderable.render());
        }
        System.out.println();
    }

	void renderB(List<Building> of) {
		  for (Renderable renderable : of) {
	            System.out.println(renderable.render());
	        }
	        System.out.println();
	}
}