public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle with vector graphics. Radius: " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square with vector graphics. Side: " + side);
    }
}