package Chapter_6_Interface_and_Annotation.Examples.Interface_Implementation;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public interface IShapeAction <T extends AbstractShape>{//параметризация,для избавления от проверок
    double computeSquare(T shape);
    double computePerimetr(T shape);
}
