public class ShortestDistanceFromAllBuildings {

    /**
     * we should add also to check that an empty spot reaches all buildings
     * @param matrix
     * @return
     */
    public static int Solution(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;



        int shortestPath = Integer.MAX_VALUE;
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                if (matrix[rowIndex][columnIndex] == 0) {
                    int[][] visited = new int[rows][columns];
                    visited[rowIndex][columnIndex] = Integer.MAX_VALUE;
                    int currentPath = getShortestPath(matrix, visited, rowIndex, columnIndex, 0);
                    if (currentPath != 0) {
                        shortestPath = Math.min(shortestPath, currentPath);
                    }
                }
            }
        }

        return shortestPath;
    }

    private static int getShortestPath(int[][] matrix, int[][] visited, int rowIndex, int columnIndex, int distance) {
        if (rowIndex >= matrix.length || rowIndex < 0 || columnIndex < 0 || columnIndex >= matrix[rowIndex].length || matrix[rowIndex][columnIndex] == 2) {
            return 0;
        }

        int previousDistance = visited[rowIndex][columnIndex];
        if (matrix[rowIndex][columnIndex] == 1) {
            int distanceToAdd = 0;

            if (previousDistance == 0 || distance < previousDistance) {
                visited[rowIndex][columnIndex] = distance;
                distanceToAdd = distance - previousDistance;
            }

            return distanceToAdd;
        }

        if (matrix[rowIndex][columnIndex] == 0 && (previousDistance == 0 || distance < previousDistance )) {
            if (previousDistance != Integer.MAX_VALUE) {
                visited[rowIndex][columnIndex] = distance;
            }

            int nextDistance = distance + 1;

            return getShortestPath(matrix, visited, rowIndex + 1, columnIndex, nextDistance) +
                    getShortestPath(matrix, visited, rowIndex - 1, columnIndex, nextDistance) +
                    getShortestPath(matrix, visited, rowIndex, columnIndex + 1, nextDistance) +
                    getShortestPath(matrix, visited, rowIndex, columnIndex - 1, nextDistance);
        }

        return 0;
    }
}
