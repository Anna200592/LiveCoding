package Pattern;
/*    Синглтон - это шаблон(параждающий паттерн) проектирования, который делает две вещи:
 Дает гарантию, что у класса будет всего один экземпляр класса,
 предоставляет глобальную точку доступа к экземпляру данного класса.*/

public class Singleton {

private static volatile Singleton instance;
private Singleton(){}

    public static Singleton getInstance() {
    Singleton localInstance = instance;
    if(localInstance == null){
        synchronized (Singleton.class){
            localInstance = instance;
            if (localInstance == null){
                instance = localInstance = new Singleton();
            }
        }
    }
        return localInstance;
    }
}
