public class MineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", ".", ".", ".", "."},
                {".",".",".",".","."},
                {".", "*", ".", ".", "."},
                {".",".",".",".","."},
        };
        final int MAP_HEIGHT = map.length;
        final int MAP_WIDTH=map[0].length;

        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
        for(int yOrsinate=0;yOrsinate<MAP_HEIGHT;yOrsinate++) {
            for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
                String currentCell = map[yOrsinate][xOrdinate];
                if (currentCell.equals("*")) {
                    mapReport[yOrsinate][xOrdinate] = "*";
                } else {
                    final int[][] NEIGHTBORS_ORINATE = {
                            {yOrsinate-1,xOrdinate-1},
                            {yOrsinate-1,xOrdinate},
                            {yOrsinate-1,xOrdinate+1},
                            {yOrsinate+1,xOrdinate+1},
                            {yOrsinate+1,xOrdinate-1},
                            {yOrsinate+1,xOrdinate},
                            {yOrsinate, xOrdinate - 1},
                            {yOrsinate, xOrdinate + 1},
                    };

                    int mineAround = 0;

                    for (int i = 0; i < NEIGHTBORS_ORINATE.length; i++) {
                        int[] neightborOrinate = NEIGHTBORS_ORINATE[i];
                        int xOrdinateOfNeighbour = neightborOrinate[1];
                        int yOrdinateOfNeighbour = neightborOrinate[0];

                        boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0 || xOrdinateOfNeighbour == MAP_WIDTH || yOrdinateOfNeighbour<0 || yOrdinateOfNeighbour==MAP_HEIGHT;
                        if (isOutOfMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                        if (isMineOwnerNeighbour) mineAround++;
                    }
                    mapReport[yOrsinate][xOrdinate] = String.valueOf(mineAround);
                }
            }
        }
        for(int yOdinate=0;yOdinate<MAP_HEIGHT;yOdinate++) {
            for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
                String currentCellReport = mapReport[yOdinate][xOrdinate];
                System.out.print(currentCellReport);
            }
            System.out.println();
        }
    }
}
