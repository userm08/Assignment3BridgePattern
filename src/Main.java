public class Main {
    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        Shape square = new Square(rasterRenderer, 4);

        circle.draw();
        square.draw();

        System.out.println("--- Switching implementations ---");

        circle = new Circle(rasterRenderer, 5);
        square = new Square(vectorRenderer, 4);

        circle.draw();
        square.draw();
    }
}