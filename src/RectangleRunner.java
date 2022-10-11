public class RectangleRunner {
    public static void main(String []args) {
        Rectangle Plot1 = new Rectangle(150,200);
        Rectangle Plot2 = new Rectangle(125);
        Rectangle Plot3 = new Rectangle();




        System.out.println("Plot 1 length: " + Plot1.getLength());
        System.out.println("Plot 1 width: " + Plot1.getWidth());
        System.out.println("Plot 1 area: " + Plot1.calculateArea());

        System.out.println("Plot 2 length: " + Plot2.getLength());
        System.out.println("Plot 2 length: " + Plot2.getWidth());
        System.out.println("Plot 2 length: " + Plot2.calculateArea());

        System.out.println("Plot 3 length: " + Plot3.getLength());
        System.out.println("Plot 3 length: " + Plot3.getWidth());
        System.out.println("Plot 3 length: " + Plot3.calculateArea());

        Plot1.setWidth(75);
        Plot2.setWidth(75);
        Plot3.setWidth(75);
        Plot2.setLength(75);

        int plot1Area = Plot1.calculateArea();
        int plot2Area = Plot2.calculateArea();
        int plot3Area = Plot3.calculateArea();
        int seed = plot1Area + plot2Area + plot3Area;

        System.out.println("These three plots requires " + seed + " square feet of seed");
















    }
}
