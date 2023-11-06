interface Forma{
    int calcArie();
    int calcPerimetru();
}
public class Rectangle implements Forma{
    int latime, inaltime;
    public Rectangle(int latime, int inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }
    public static void main(String[] args){
        Rectangle dreptunghi = new Rectangle(5, 10);
        System.out.println(dreptunghi.calcPerimetru());
        System.out.println(dreptunghi.calcArie());
    }
    @Override
    public int calcArie() {
        return this.inaltime * this.latime;
    }
    @Override
    public int calcPerimetru() {
        return 2 * this.inaltime + 2 * this.latime;
    }
}