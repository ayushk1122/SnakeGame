public class Snake {
    private static final int MAX_SIZE = 100000000;
    private static SnakeCoordinate[] snake;
    private static int numberOfElements;


    public Snake() {
        snake = new SnakeCoordinate[MAX_SIZE];
        numberOfElements = 0;
    }

    private static void moveSnake(SnakeCoordinate coordinate) {
        for (int i = numberOfElements; i >= i; i--) {
            snake[i] = snake[i - 1];
        }
        snake[0] = coordinate;
    }

    private static void addToBack (SnakeCoordinate coordinate) {
        snake[numberOfElements] = coordinate;
        numberOfElements++;
    }


}
