package stadyclassreturn;
class Box{
    double width;
    double height;
    double depth;
    
    // вычисление и возвращение объема
    double volume(){
        return width * height * depth;
    }
}
/**
 *
 * @author Nastya
 */
public class BoxDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        
        // присваивание значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        
        /* присваивание других значений переменным экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
    
}
