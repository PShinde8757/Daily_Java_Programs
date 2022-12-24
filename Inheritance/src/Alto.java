public class Alto extends Car{
    boolean hasAirBag;
    int numOfAirBags;

    public Alto(int c_cc, int c_wheels, String c_colour, boolean hasAirBag, int numOfAirBags) {
        super(c_cc, c_wheels, c_colour);
        this.hasAirBag = hasAirBag;
        this.numOfAirBags = numOfAirBags;
    }


    public boolean isHasAirBag() {
        return hasAirBag;
    }

    public void setHasAirBag(boolean a_hasAirBag) {
        this.hasAirBag = a_hasAirBag;
    }

    public int getNumOfAirBags() {
        return numOfAirBags;
    }

    public void setNumOfAirBags(int a_numOfAirBags) {
        this.numOfAirBags = a_numOfAirBags;
    }

    @Override
    public String toString() {
        return "Alto{" +
                "hasAirBag=" + hasAirBag +
                ", numOfAirBags=" + numOfAirBags +
                '}'+super.toString();
    }
}
