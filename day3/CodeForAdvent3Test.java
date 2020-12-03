package com.ur.web.robot.service.impl.service.program;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CodeForAdvent3Test {

	String xxx = ".#......##..#.....#....#.#.#...\n" +
			".#.#...#.##.#..........#...##..\n" +
			".........#.....#.####........#.\n" +
			".......#.#...#.#...............\n" +
			"..#....#...#.#...#.#...#.#.....\n" +
			"...#...........#..#.........#.#\n" +
			"....#..#....#..#..#.#...#..##..\n" +
			"#...........#..#.....#.......#.\n" +
			"#..#...#...#.###...#...#.#...#.\n" +
			"#...#.#.......#...#...#...##.##\n" +
			"..#..................#.#.#....#\n" +
			"..#.##....#........##..........\n" +
			".....#....#....#.#.......#.....\n" +
			"##.#..##.#.....###.......#.....\n" +
			"......#...###....#..#.#...#....\n" +
			"..............#.........#.##...\n" +
			"#......#.............#....#...#\n" +
			".#..#......#.###....#...#.....#\n" +
			"..#........#.....#.....#...#..#\n" +
			".......#...#..............#..#.\n" +
			"..#...#........#...##........#.\n" +
			".#........#....#......#......#.\n" +
			"....#..#.###.......##....#.#..#\n" +
			"..#..###..#....................\n" +
			"......#...#....#.........#.#...\n" +
			"....#.##................#..#...\n" +
			"....#......######.....#........\n" +
			".#......##.......#....#..##.###\n" +
			"..#...##.###..#.......#....#...\n" +
			"....#.###...#.#.#........#.....\n" +
			"...###...#.......#..........#.#\n" +
			"..........#...#..........##.#..\n" +
			"..#....#........#.....#....#..#\n" +
			"..#...#.#....##..#...##....#...\n" +
			"........##...#..##.....#.......\n" +
			"###.......#.#...#...#.......#.#\n" +
			"....#.#....##.###........#.....\n" +
			".....#..............#....##..##\n" +
			"#......#.#....#.#......#.....##\n" +
			".....#....#..#......#...#......\n" +
			"..#.##..#.....#..#....#......#.\n" +
			".....#.#.#..........##....#....\n" +
			".........#..#..........#.#.....\n" +
			".##..#...#......#.#..#....#....\n" +
			"#.#..##.......#.#......##......\n" +
			"..#.#....#.#.....#.............\n" +
			".#.........#.......#..#.#......\n" +
			"##.........#..##.#......#......\n" +
			"#..#.....#...#.....#.........#.\n" +
			"..........#..##..##.#..##...###\n" +
			"..##.....#...#..##...##.#.#....\n" +
			"..#..........#.#.....##.#....#.\n" +
			".##..#..#.........###.......#..\n" +
			"......##....#...##....##.......\n" +
			".....#.#.##...............#....\n" +
			"#..#......#.....#..#..#.#.....#\n" +
			".....##.#....#.#.....#.#.#.....\n" +
			"....#..#.#..##....#.....#....#.\n" +
			"#...#.....#....#....#.#.#......\n" +
			".....#................#.......#\n" +
			".......#..#.#...#.#......#..#.#\n" +
			"...........#....#....###...#.#.\n" +
			"#.##....##..###.#.#......#.##.#\n" +
			"..##...#.#..#..#...#.....#.#.#.\n" +
			"#.....###.#..#.#...#.#......#.#\n" +
			"..##.#...#...#.#.....#.#.......\n" +
			"#....#...#.##......#.#......#..\n" +
			"..#.....##.....#...............\n" +
			".....###...##.#...........#....\n" +
			"...#..##.....##....#...........\n" +
			".....#..#......#..........#....\n" +
			"....##..##.#...#...#.#.....#.##\n" +
			".#.....###..###.#...#.#..#....#\n" +
			".#..........#...#..#.#.#..#...#\n" +
			".##.##..#..#....#....####......\n" +
			"....#..#.#..........#..........\n" +
			"###...#.#..#..#...#..###.......\n" +
			"####.#...#....#..#...#..#......\n" +
			".....##....#.#...#....##....##.\n" +
			"....#.#.##....#.##..#....#.#.#.\n" +
			"#......#..#.###....#####.##....\n" +
			"..##..#.#.#..#........##.##..##\n" +
			"#.#...#..#..#......#..#.....#..\n" +
			".###.....#.#....#.#..##.....#.#\n" +
			"....#......#.#...#...#.#....#.#\n" +
			".....#.###.##..................\n" +
			".#..........#........#.#...##.#\n" +
			".##......#.#.#..#....##.###..#.\n" +
			"..#.##....#....#.........#.#..#\n" +
			"........#..#..#.#.####.....##..\n" +
			"#..#.##.#......#.#..##.#...#..#\n" +
			"..#.#.##..#.##..........#......\n" +
			"##.#.....#.#.##..#..##.....##.#\n" +
			".##........#..#.....#...#.##.##\n" +
			"...#....#.#.#.........##.....#.\n" +
			"...#....#.#....#...#..#........\n" +
			".....#...#..#...#.##......##...\n" +
			"##.........#......#..........##\n" +
			".#......#.....##....#.#.#.....#\n" +
			"..#.###......#..#.#....#.....#.\n" +
			".#.......#...#...#.#.#.#..##...\n" +
			"...#..............#...###.....#\n" +
			"...##......#.#..#.#........#.#.\n" +
			"..##.#....#..........##...#.#..\n" +
			"..#...#.....#.######...##...#..\n" +
			"#...#...#............#.....#...\n" +
			".###..###.##..#.........#......\n" +
			".#........##..#....#...#.#..##.\n" +
			"#.#.##.#.#...###...............\n" +
			"..#.#.#......#.#.#....#.....#.#\n" +
			".#...........#.##.#..#.###.....\n" +
			".###.#....#...........##.#.#...\n" +
			".#...#...........#..##.........\n" +
			".#...#.#...........#..###....#.\n" +
			".##.......#.....#.....##....#..\n" +
			"#.......#........#...##.##..#.#\n" +
			"....#..###..#.....##.......#...\n" +
			"......###.#...#..#....#.#...#..\n" +
			"..#..#.......##...#.#.#...#....\n" +
			"......#..#.......#.......##.#..\n" +
			"#.#....###.....#...#..#...#....\n" +
			"#...#.##.#........#..........##\n" +
			".....#.#.##.#.#..#..##.......##\n" +
			".#.#.......##....#.#...........\n" +
			"#..##.............##...#.#..#..\n" +
			"#...........#.#......#.##.##..#\n" +
			"...#...#...........#....###.#.#\n" +
			".##..#.#.#....#....#####.......\n" +
			"..#...#.....#.#....#...........\n" +
			".#..#........#.....#.#......#..\n" +
			".#.........#...#...#.#.#..#....\n" +
			".##.##......#.#...#.......#...#\n" +
			".##...#..#..........#...#.....#\n" +
			"#..........#..#...#.#......#...\n" +
			"....##......#...##..##..#....#.\n" +
			".##.......#...#.#..##..#..#....\n" +
			".#.#................#....#.....\n" +
			"..#..#..###.......#............\n" +
			"...##.....#..#......#....#.....\n" +
			"....#...###...#....#..##...#.#.\n" +
			"#.........#.......#...#....#...\n" +
			".#.#...#.#....##....#.#..##.#..\n" +
			"...#..#..#....#..#.#..##.....##\n" +
			"..#..#.#.#....#...#....#..#....\n" +
			"......###.....#...##.#..#.#...#\n" +
			".#.#.#..#.##........#.#....#...\n" +
			".#..........#....#.#.......#...\n" +
			"#.....#........#........#....#.\n" +
			".#.#..#...#...................#\n" +
			"....####..#..#..#..#....#..#.#.\n" +
			"..##.#..........#.##..#.....##.\n" +
			"..................##..........#\n" +
			"....##....###.....#..#...#.#...\n" +
			".##.........#..#...............\n" +
			"....##..###....#.##............\n" +
			"#.#...###.#..##...#...........#\n" +
			".....#..#......#.....#.........\n" +
			"..#..##...#.....#.....#.#......\n" +
			"......#....###.#..#.#.#....#..#\n" +
			"#...#.......#.##.....#.........\n" +
			".#.#..#...#.............##.....\n" +
			"......#..............#.....#..#\n" +
			"......#......###....#...#......\n" +
			".....#.....#...#.......###.....\n" +
			"#..........##......##.#.#.....#\n" +
			"....#.......#..#......#.......#\n" +
			"..#...#.###...........#..#.###.\n" +
			".....#...#.#...........#.#...##\n" +
			"........#.#.#........#.#.....#.\n" +
			"....##..##.#.#..#.#....#.#.##..\n" +
			"..#.#.#......##.....#...#.#...#\n" +
			"##...#..#......#.#.#..#...#....\n" +
			"....#..##...........#..#..#..#.\n" +
			".#..##...#...#...##.#..#.#....#\n" +
			".#.....####.#..#..#....##..#.#.\n" +
			".#....#..#......#.....#.#.#....\n" +
			"....#..#.....#......#..........\n" +
			"..#.#..###.....#...#...#.....##\n" +
			"..#.#...##..#...........####...\n" +
			".#.##....##.#......#.....##.#..\n" +
			"#.##..#....#.###..........##...\n" +
			".###...#......#.#....##........\n" +
			"...................#..#.....#..\n" +
			"#.#...#.#..#.....#...#..####.##\n" +
			"....#.##..##...##.##.....#.....\n" +
			".#...#.##...........#.......##.\n" +
			"###..#.....##...#.........##...\n" +
			".###....##...###...............\n" +
			".#....#####........#.#.#.##....\n" +
			".#.#....####.##........#.......\n" +
			".....#......#..................\n" +
			"......###.....##......#..##.#..\n" +
			"....#.#...........##.#....##.#.\n" +
			"...................#.#.#.......\n" +
			"#.#.#........#..#.......##.....\n" +
			"..#...#...#....#......#....##.#\n" +
			"#..#..............#......#....#\n" +
			"......#.........##.............\n" +
			".....#.#....##..#.......#......\n" +
			"......#.......#...........#....\n" +
			"....#....#.#..##.#....#...#....\n" +
			"#.#.#..#..#.#.#.#...#....#....#\n" +
			".#.#....#...#.#..#......#.....#\n" +
			".#...........#.#....##.....#...\n" +
			"........#...#....#....##.....##\n" +
			"#..#..........#..#..#.....#....\n" +
			"#.#.###..........#.##....#...##\n" +
			"..#................#.##.##.....\n" +
			"..#...#.##...##...#.........#..\n" +
			"#....#......#......#.........#.\n" +
			"##...#...##.#.........#......#.\n" +
			".......#.....#.................\n" +
			"...#...#.....##.........#.#..#.\n" +
			"..#......#...#.......#......#.#\n" +
			"#.......#...#.##.#..##..#......\n" +
			".#.#............#...###..#.....\n" +
			"...#.......##.......#....#..#..\n" +
			".....#..#.#....#.#.............\n" +
			"#....#...##.##....#....##......\n" +
			"........#......#.......#....#..\n" +
			"..#..#..##......##.#..#.#..##..\n" +
			"....##......#.##.##......#.....\n" +
			"........##.#...#.....#.......#.\n" +
			"..##.#....#..#......#.##.......\n" +
			"..##.####.#...#.#....#.........\n" +
			".#........#.....#..#....#...#.#\n" +
			"###....##......#..#..#.##..#...\n" +
			"..........###.#..#..#....#.....\n" +
			"..#.........#....#.....#....#.#\n" +
			".#...#.#.....##.#...#...#.#..#.\n" +
			"....##......##.##.#.....#..#...\n" +
			"....#.##...##.......#..##......\n" +
			"#..........#..#....#.......#.#.\n" +
			"..#.....#.................#....\n" +
			"..........#.#.#.....#.#....#..#\n" +
			".......#..........#.##....#....\n" +
			"#..#.....#.......#........#....\n" +
			"#.....##..#.........##..#..#.#.\n" +
			".##.#...#..........#....#......\n" +
			"....#..#.#......#.##..#..#.##..\n" +
			"...##.####....#.....#.#...##...\n" +
			"..#.#....#.#........#..........\n" +
			"#...#.#.##.##....##..#...#...#.\n" +
			"...#.#.......#..#...#..#..##..#\n" +
			".....#....#........###.....#...\n" +
			".......#..#.##....#.#.....#....\n" +
			"....##....#....#.......#.....#.\n" +
			".........#........###...##.....\n" +
			"#.#..#...##.........#.#..#....#\n" +
			"...##...........#.........#...#\n" +
			"......#.#.#.........#..#.#.#...\n" +
			"........##.###....#..#.......#.\n" +
			"....#.#...#......#..#........##\n" +
			".#....##....#...#.##.........#.\n" +
			"####.#..#...........##.#.#.....\n" +
			"...#....#..#.....#..##.####.#..\n" +
			".##...#...........#.#.........#\n" +
			"#.#..#..#...#.#.#.........#..#.\n" +
			"#......###............#...#....\n" +
			"..#.......#....#...#...#..#...#\n" +
			"#.#.#...##..#...#...#.......##.\n" +
			"......#.#.......#..........#.#.\n" +
			"...............#...#..#...#.#..\n" +
			".#.#...##.####..##.##....#..##.\n" +
			"#..####.......##.#........#...#\n" +
			"......###....##...#.#..#.##....\n" +
			".##.....###..#...#.###.###.....\n" +
			"..#...#.....#...#..#..##..#....\n" +
			"...#...##.....##........#.#.##.\n" +
			".#...#..#....#....#..###....#.#\n" +
			"..#.#.#.#.#..........#.#..#..##\n" +
			".......###.....................\n" +
			"##.#......#.##.....#.........#.\n" +
			"......................#.#.....#\n" +
			"#..#........##.......#..##..#.#\n" +
			"#.#.#.....##.#.##.##.#....##...\n" +
			".#...#.....#.........#.....#...\n" +
			"..#.........#.##.#.###.#......#\n" +
			".........#..#.##...#.......###.\n" +
			".....##........#......#........\n" +
			"...#.#...##...#........#.##....\n" +
			".........##............#.####..\n" +
			"#....#...#...#..#....#..#.#.#.#\n" +
			"..#.........#......#.##........\n" +
			"....#.....#........#........#.#\n" +
			".##.#..#.#..#..###......###....\n" +
			"#.###.....#.#.#.##........#..##\n" +
			"#.#..#...##.....#....#...#.#...\n" +
			"......#....#.....#...#.........\n" +
			"...#........##.......#.##..####\n" +
			"..#..#....#....#..#..#...#.##..\n" +
			".##.....#............#...#.....\n" +
			"......#.......#.....#...#.#.#..\n" +
			".........#.....#...##..........\n" +
			".....#........##...........#...\n" +
			"#.#..##.#...#....#....#........\n" +
			"#.##..#.#.......#...#......#...\n" +
			"...........#.#..#..#.....##.#..\n" +
			"#....#.##.......#......#.##..#.\n" +
			".....#........#.##.#...#.....#.\n" +
			".....###..#.......##...........\n" +
			".........#.#.#.....#.##.......#\n" +
			".......#....#......#.#.....#...\n" +
			"##........#...#..#.#.........#.\n" +
			"##...........#.##...##......#..\n" +
			"..#.###.#.#.#...####..#....###.\n" +
			".........#...#.....##....#.#.##\n" +
			".###..###.#.#.....#.##.........\n" +
			"#..#...#.#.................##.#\n" +
			"##.........#.#....#.#...#.###..\n" +
			"#.#....#..............#.##.#...\n" +
			"...#..#....##.#..#.......#..##.\n" +
			".#..#.###......##..........#..#\n" +
			".##....#.#....#....#.#..#......\n" +
			".......#.....#..#....#.##...#..\n" +
			"#.#.#.........###..#..#.....#..\n" +
			"...##..##...##....#..#......#..\n" +
			"..........#....#..........#....\n" +
			"#..##..#...#......#.....#.#....\n" +
			"#..##..#....#.#.#...#..........\n" +
			"......##..#.........#........#.\n" +
			".##..#..#......###.....#..#....\n" +
			".....#..#.##..........#.#..#...";
	int[][] matrix;
	int LENGTH = 31;
	int HEIGHT = 323;

	@Test
	public void test3() {
		matrix = new int[323][];
		String[] split = xxx.split("\n");
		int index = 0;
		for (String s : split) {
			matrix[index] = new int[31];
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '#') {
					matrix[index][i] = 1;
				} else {
					matrix[index][i] = 0;
				}
			}
			index++;
		}
		int treesEncountered = 0;
		int currentRow = 0;


		for (int i = 0; i < HEIGHT - 1; i++) {
			if (isThereAtreeAtCoordinate((i + 1), (i + 1) * 2)) {
				treesEncountered++;
			}
		}
		System.out.println("Trees = " + treesEncountered);

/*
		Right 1, down 1. (66)
		Right 3, down 1. (200)
		Right 5, down 1. (76)
		Right 7, down 1. (81)
		Right 1, down 2. (103)
*/

	}

	private boolean isThereAtreeAtCoordinate(int column, int row) {
		if (row >= HEIGHT) {
			return false;
		}
		int x = column % LENGTH;
		return matrix[row][x] == 1;
	}

}

