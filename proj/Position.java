package proj;

public class Position {
    public Linable linable;

    Position(Linable linable) {
        this.linable = linable;
    }

    public void setLinable(Linable linable) {
        this.linable = linable;
        linable.setPosition(this);
    }
}
