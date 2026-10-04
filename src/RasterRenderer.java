public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle with raster graphics. Radius: " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square with raster graphics. Side: " + side);
    }
}