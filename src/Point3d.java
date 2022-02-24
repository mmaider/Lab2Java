public class Point3d extends Point2d {
    //Объявление переменной z
    private double zCoord;

    //Конструктор инициализации
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    //Конструктор по умолчанию
    public Point3d() {
        this(0, 0, 0);
    }

    //Возвращение координаты Z
    public double getZ() {
        return zCoord;
    }

    //Установка значения координаты Z
    public void setZ(double val) {
        zCoord = val;
    }

    //Сравнение двух точек
    public boolean compare(Point3d point) {
        if (point.xCoord == xCoord && point.yCoord == yCoord && point.zCoord == zCoord) {
            return true;
        }
        return false;
    }

    //Вычисление расстояния
    public double distanceTo(Point3d object, Point3d object1) {
        double distance = Math.sqrt(Math.pow(object1.getX() - object.getX(), 2) + Math.pow(object1.getY() - object.getY(), 2) + Math.pow(object1.getZ() - object.getZ(), 2));
        return distance;
    }
}