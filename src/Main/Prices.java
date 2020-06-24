public class Prices {
    String[] listOfFruits = {"Strawberry", "Raspberry", "Blackberry", "Gooseberry"};
    double stGradeAPrice = 0; double stGradeBPrice = 0; double stGradeCPrice = 0; double stRejectedPrice = 0;
    double raGradeAPrice = 0; double raGradeBPrice = 0; double raGradeCPrice = 0; double raRejectedPrice = 0;
    double blGradeAPrice = 0; double blGradeBPrice = 0; double blGradeCPrice = 0; double blRejectedPrice = 0;
    double goGradeAPrice = 0; double goGradeBPrice = 0; double goGradeCPrice = 0; double goRejectedPrice = 0;
    private JSONProcessor jsonP;
    private InputHandler inputHandler;
    private Batch batch;

    public Prices(Batch batch, InputHandler inputHandler, JSONProcessor jsonP) {
        this.inputHandler = inputHandler;
        this.jsonP = jsonP;
        this.batch = batch;
    }

    void setSTDailyPrice() {
        System.out.println("\nPlease enter prices for " + listOfFruits[0]);
        System.out.println("Please enter grade A price. \n£");
        stGradeAPrice = inputHandler.getPrice();
        if(stGradeAPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setSTDailyPrice();
        }
        System.out.println("Please enter grade B price.");
        stGradeBPrice = inputHandler.getPrice();
        if(stGradeBPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setSTDailyPrice();
        }
        System.out.println("Please enter grade C price.");
        stGradeCPrice = inputHandler.getPrice();
        if(stGradeCPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setSTDailyPrice();
        }
        System.out.println("Please enter rejects price.");
        stRejectedPrice = inputHandler.getPrice();
        if(stRejectedPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setSTDailyPrice();
        }
    }

    void setRADailyPrice() {
        String[] listOfFruits = {"Strawberry", "Raspberry", "Blackberry", "Gooseberry"};
        System.out.println("\nPlease enter prices for " + listOfFruits[1]);
        batch.setFruit(listOfFruits[1]);
        System.out.println("Please enter grade A price.");
        raGradeAPrice = inputHandler.getPrice();
        if(raGradeAPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setRADailyPrice();
        }
        System.out.println("Please enter grade B price.");
        raGradeBPrice = inputHandler.getPrice();
        if(raGradeBPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setRADailyPrice();
        }
        System.out.println("Please enter grade C price.");
        raGradeCPrice = inputHandler.getPrice();
        if(raGradeCPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setRADailyPrice();
        }
        System.out.println("Please enter rejects price.");
        raRejectedPrice = inputHandler.getPrice();
        if(raRejectedPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setRADailyPrice();
        }
    }

    void setBLDailyPrice() {
        String[] listOfFruits = {"Strawberry", "Raspberry", "Blackberry", "Gooseberry"};
        System.out.println("\nPlease enter prices for " + listOfFruits[2]);
        batch.setFruit(listOfFruits[2]);
        System.out.println("Please enter grade A price.");
        blGradeAPrice = inputHandler.getPrice();
        if(blGradeAPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setBLDailyPrice();
        }
        System.out.println("Please enter grade B price.");
        blGradeBPrice = inputHandler.getPrice();
        if(blGradeBPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setBLDailyPrice();
        }
        System.out.println("Please enter grade C price.");
        blGradeCPrice = inputHandler.getPrice();
        if(blGradeCPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setBLDailyPrice();
        }
        System.out.println("Please enter rejects price.");
        blRejectedPrice = inputHandler.getPrice();
        if(blRejectedPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setBLDailyPrice();
        }
    }

    void setGODailyPrice() {
        String[] listOfFruits = {"Strawberry", "Raspberry", "Blackberry", "Gooseberry"};
        System.out.println("\nPlease enter prices for " + listOfFruits[3]);
        batch.setFruit(listOfFruits[3]);
        System.out.println("Please enter grade A price.");
        goGradeAPrice = inputHandler.getPrice();
        if(goGradeAPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setGODailyPrice();
        }
        System.out.println("Please enter grade B price.");
        goGradeBPrice = inputHandler.getPrice();
        if(goGradeAPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setGODailyPrice();
        }
        System.out.println("Please enter grade C price.");
        goGradeCPrice = inputHandler.getPrice();
        if(goGradeAPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setGODailyPrice();
        }
        System.out.println("Please enter rejects price.");
        goRejectedPrice = inputHandler.getPrice();
        if(goGradeAPrice == -1){
            System.out.println("ERROR - Price cannot be negative");
            setGODailyPrice();
        }
    }

    public void savePricesToFile(String date){
        jsonP.writeJSONPriceFile(date, stGradeAPrice, stGradeBPrice, stGradeCPrice, stRejectedPrice,
                raGradeAPrice, raGradeBPrice, raGradeCPrice, raRejectedPrice,
                blGradeAPrice, blGradeBPrice, blGradeCPrice, blRejectedPrice,
                goGradeAPrice, goGradeBPrice, goGradeCPrice, goRejectedPrice);

    }

    public double getStGradeAPrice() { return stGradeAPrice; }
    public double getStGradeBPrice() { return stGradeBPrice; }
    public double getStGradeCPrice() { return stGradeCPrice; }
    public double getStRejectedPrice() { return stRejectedPrice; }

    public double getBlGradeAPrice() { return blGradeAPrice; }
    public double getBlGradeBPrice() { return blGradeBPrice; }
    public double getBlGradeCPrice() { return blGradeCPrice; }
    public double getBlRejectedPrice() { return blRejectedPrice; }

    public double getRaGradeAPrice() { return raGradeAPrice; }
    public double getRaGradeBPrice() { return raGradeBPrice; }
    public double getRaGradeCPrice() { return raGradeCPrice; }
    public double getRaRejectedPrice() { return raRejectedPrice; }

    public double getGoGradeAPrice() { return goGradeAPrice; }
    public double getGoGradeBPrice() { return goGradeBPrice; }
    public double getGoGradeCPrice() { return goGradeCPrice; }
    public double getGoRejectedPrice() { return goRejectedPrice; }


}
