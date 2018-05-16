package nordicmotorhomes.project.Model;

public class Price {
    private int peakSeasonPrice;
    private int middleSeasonPrice;
    private int lowSeasonPrice;

    public Price(int peakSeasonPrice, int middleSeasonPrice, int lowSeasonPrice)
    {
        this.peakSeasonPrice=peakSeasonPrice;
        this.middleSeasonPrice= middleSeasonPrice;
        this.lowSeasonPrice=lowSeasonPrice;
    }


    public int getPeakSeasonPrice() {
        return peakSeasonPrice;
    }

    public void setPeakSeasonPrice(int peakSeasonPrice) {
        this.peakSeasonPrice = peakSeasonPrice;
    }

    public int getMiddleSeasonPrice() {
        return middleSeasonPrice;
    }

    public void setMiddleSeasonPrice(int middleSeasonPrice) {
        this.middleSeasonPrice = middleSeasonPrice;
    }

    public int getLowSeasonPrice() {
        return lowSeasonPrice;
    }

      public void setLowSeasonPrice(int lowSeasonPrice) {
        this.lowSeasonPrice = lowSeasonPrice;
    }

    public String toString(){
        return "Price{"+
                "peakSeasonPrice=" + peakSeasonPrice +
                ", middleSeasonPrice=" + middleSeasonPrice + '\'' +
                ", lowSeasonPrice=" + lowSeasonPrice + '\'' +
                '}';
    }


}
