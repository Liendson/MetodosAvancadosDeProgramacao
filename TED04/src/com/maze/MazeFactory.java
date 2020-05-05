package com.maze;

import com.model.common.Door;
import com.model.common.Maze;
import com.model.common.Room;
import com.model.common.Wall;

public class MazeFactory extends AbstractMazeFactory {
    @Override
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    public Wall makeWall() {
        return new Wall();
    }

    @Override
    public Room makeRoom() {
        return new Room();
    }

    @Override
    public Door makeDoor() {
        return new Door();
    }
}
