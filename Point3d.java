import java.math.RoundingMode;

/**
 Класс Point3d создает точку в трехмерном пространстве с координатами x,y,z
 **/
public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    /**
     Класс Point3d создает точку в трехмерном пространстве с координатами x,y,z
     **/
    public Point3d (double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /**
     Класс comparison сравнивает значения объектов point3d (координаты x,y,z)
     **/
    public boolean comparison(Point3d point3d) {
        return (this.xCoord == point3d.xCoord)&&(this.yCoord == point3d.yCoord)&&(this.zCoord == point3d.zCoord);
    }
    public Point3d(){ //значение для точки по умолчанию: 0,0,0
        this(0,0,0);
    }
    /**
     Класс distanceTo считает расстояение между двумя объектами Point3d (между двумя точками) с точностью до 2 знаков после запятой
     **/
    public double distanceTo(Point3d point3d){
        double distance =  Math.sqrt((this.xCoord - point3d.xCoord) * (this.xCoord - point3d.xCoord) +
                (this.yCoord - point3d.yCoord) * (this.yCoord - point3d.yCoord) +
                (this.zCoord - point3d.zCoord) * (this.zCoord - point3d.zCoord));
        return Math.round(distance * 100.0) / 100.0; //округляем до двух цифр после запятой
    }
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }
    public void setX (double val){
        xCoord = val;
    }
    public void setY (double val){
        yCoord = val;
    }
    public void setZ (double val){
        zCoord = val;
    }
}