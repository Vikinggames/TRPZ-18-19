package patterns.lab1.decorator;

public class LineTypeDecorator extends AbstractDecorator {
    public LineTypeDecorator(Figure figure) {
        this.figure = figure;
    }

    @Override
    String show() {
        System.out.println("In LineTypeDecorator.show()");
        return figure.show() + " - bold";
    }
}
