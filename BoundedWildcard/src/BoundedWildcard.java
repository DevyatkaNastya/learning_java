public class BoundedWildcard {
    static void showXY(Coords<?> c) {
        System.out.println("Coord X Y");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Coord X Y Z");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x +
                    " " + c.coords[i].y +
                    " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("All coord");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x +
                    " " + c.coords[i].y +
                    " " + c.coords[i].z +
                    " " + c.coords[i].t);
        }
        System.out.println();
    }


    public static void main (String args[]) {
        TwoD td[] = {
                new TwoD(0, 10),
                new TwoD(15, 9),
                new TwoD(-1, -23),
        };

        Coords<TwoD> tdlocs = new Coords<>(td);

        System.out.println("Inside tdlocs ");
        showXY(tdlocs);

        FourD fd[] = {
                new FourD(2, 3, 4, 5),
                new FourD(1, 2, 3, 4),
                new FourD(3, -4, 10, -8),
        };

        Coords<FourD> fdlocs = new Coords<>(fd);

        System.out.println("inside fdlocs");

        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
