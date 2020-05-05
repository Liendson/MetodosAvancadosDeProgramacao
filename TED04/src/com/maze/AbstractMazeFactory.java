package com.maze;

import com.model.*;
import com.model.common.Door;
import com.model.common.Maze;
import com.model.common.Room;
import com.model.common.Wall;

public abstract class AbstractMazeFactory {

    public static AbstractMazeFactory AbstractMazeGetInstance(Long typeMaze) {
        if (typeMaze.equals(MazeUtilities.COMMON_MAZE)) {
            return new MazeFactory();
        } else if (typeMaze.equals(MazeUtilities.ENCHANTED_MAZE)) {
            return new EnchantedMazeFactory();
        } else {
            return null;
        }
    }

    public abstract Maze makeMaze();
    public abstract Wall makeWall();
    public abstract Room makeRoom();
    public abstract Door makeDoor();
}
