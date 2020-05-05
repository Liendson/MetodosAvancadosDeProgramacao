package com.maze;

import com.model.enchanted.EnchantedDoor;
import com.model.enchanted.EnchantedMaze;
import com.model.enchanted.EnchantedRoom;
import com.model.enchanted.EnchantedWall;

public class EnchantedMazeFactory extends AbstractMazeFactory {
    @Override
    public EnchantedMaze makeMaze() {
        return new EnchantedMaze();
    }

    @Override
    public EnchantedWall makeWall() {
        return new EnchantedWall();
    }

    @Override
    public EnchantedRoom makeRoom() {
        return new EnchantedRoom();
    }

    @Override
    public EnchantedDoor makeDoor() {
        return new EnchantedDoor();
    }
}
