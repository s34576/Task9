public class Car implements Comparable<Car>{
    private String modelSamochodu;
    private int rokProdukcji;

    public Car(String modelSamochodu, int rokProdukcji) {
        this.modelSamochodu = modelSamochodu;
        this.rokProdukcji = rokProdukcji;
    }

    public String getModelSamochodu() {
        return modelSamochodu;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public int compareTo(Car inny) {
        return Integer.compare(this.rokProdukcji,inny.rokProdukcji);
    }
    @Override
    public String toString() {
        return modelSamochodu + "\t" + rokProdukcji;
    }

}
