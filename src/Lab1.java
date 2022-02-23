public class Lab1 {
    public static void main(String[] args) {
        int l = args.length;
        Point3d firstPoint = new Point3d();
        Point3d secondPoint = new Point3d();
        Point3d thirdPoint = new Point3d();
        if (l >= 3) {
            firstPoint = new Point3d(Double.valueOf(args[0]), Double.valueOf(args[1]), Double.valueOf(args[2]));
            if (l >= 6) {
                secondPoint = new Point3d(Double.valueOf(args[3]), Double.valueOf(args[4]), Double.valueOf(args[5]));
                if (l >= 9) {
                    thirdPoint = new Point3d(Double.valueOf(args[6]), Double.valueOf(args[7]), Double.valueOf(args[8]));
                } else {
                    thirdPoint = new Point3d();
                }
            } else {
                secondPoint = new Point3d();
                thirdPoint = new Point3d();
            }
        } else {
            firstPoint = new Point3d();
            secondPoint = new Point3d();
            thirdPoint = new Point3d();
        }
//        Double[] newarr = new Double[9];
//        for (int i = 0; i < l; i++) {
//            newarr[i] = Double.valueOf(args[i]);
//        }
//        for (int i = l; i < 9; i++) {
//            newarr[i] = 0.0;
//        }
//        Point3d firstPoint = new Point3d(newarr[0], newarr[1], newarr[2]);
//        Point3d secondPoint = new Point3d(newarr[3], newarr[4], newarr[5]);
//        Point3d thirdPoint = new Point3d(newarr[6], newarr[7], newarr[8]);
        System.out.println(computerArea(firstPoint, secondPoint, thirdPoint));
    }

    //Площадь треугольника
    public static double computerArea(Point3d object, Point3d object1, Point3d object2) {
        Point3d point = new Point3d();
        double AB = point.distanceTo(object, object1);
        double BC = point.distanceTo(object1, object2);
        double CA = point.distanceTo(object2, object);
        double p = (AB + BC + CA) / 2;
        double S = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
        return S;
    }
}