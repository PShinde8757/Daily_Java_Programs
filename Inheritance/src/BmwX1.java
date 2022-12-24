public class BmwX1 extends Car {

    boolean hasMassageSeating;
    boolean hasSunRoof;

    public BmwX1(int c_cc, int c_wheels, String c_colour, boolean hasMassageSeating, boolean hasSunRoof) {
        super(c_cc, c_wheels, c_colour);
        this.hasMassageSeating = hasMassageSeating;
        this.hasSunRoof = hasSunRoof;
    }


    public boolean getHasMassageSeating() {
        return hasMassageSeating;
    }

    public void setHasMassageSeating(boolean b_hasMassageSeating) {
        this.hasMassageSeating = b_hasMassageSeating;
    }

    public boolean getHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean b_hasSunRoof) {
        this.hasSunRoof = b_hasSunRoof;
    }

    @Override
    public String toString() {
        return "BmwX1{" +
                "hasMassageSeating=" + hasMassageSeating +
                ", hasSunRoof=" + hasSunRoof +
                '}' + super.toString() ;
    }
}