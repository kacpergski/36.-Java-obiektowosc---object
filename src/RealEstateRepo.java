public class RealEstateRepo {

    private RealEstate[] realEstates = new RealEstate[10];
    private  int index = 0;

    public void add(RealEstate realEstate) {
        if (index < realEstates.length) && !exists(realEstate) {
            realEstates[index++] = realEstate;
        }
    }

    private boolean exists(RealEstate realEstate) {
        boolean exists = false;
        for (int i = 0; i < index ; i++) {
          exists =  realEstates[i].equals(realEstate)
        }
    }

    public void displayAll(){
            for (int i = 0; i < index; i++) {
                System.out.println(realEstates[i]);
            }


        }

}
