public class Point3d {
    //Объявление переменных
    private double xCoord;
    private double yCoord;
    private double zCoord;

    //Конструктор инициализации
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    //Конструктор по умолчанию
    public Point3d () {
        this(0, 0, 0);
    }

    //Возвращение координаты X
    public double getX () {
        return xCoord;
    }

    //Возвращение координаты Y
    public double getY () {
        return yCoord;
    }

    //Возвращение координаты Z
    public double getZ () {
        return zCoord;
    }

    //Установка значения координаты X
    public void setX ( double val) {
        xCoord = val;
    }

    //Установка значения координаты Y
    public void setY ( double val) {
        yCoord = val;
    }

    //Установка значения координаты Z
    public void setZ ( double val) {
        zCoord = val;
    }

    //Сравнение двух объектов
    public static boolean Compare(Point3d object, Point3d object1) {
        return object.equals(object1);
    }

    //Вычисление расстояния между точками
    public double distanceTo(Point3d object, Point3d object1){

        double x = object.getX();
        double y = object.getY();
        double z = object.getZ();
        double x1 = object1.getX();
        double y1 = object1.getY();
        double z1 = object1.getZ();

        double distance = Math.sqrt(Math.pow(object1.getX()-object.getX(), 2)+Math.pow(object1.getY()-object.getY(), 2)+Math.pow(object1.getZ()-object.getZ(), 2));
        return distance;
    }
}